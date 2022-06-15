import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;






public class Main extends JFrame implements ActionListener {

    private JPanel contentPane;
    public int musicnum = 0;
    public ArrayList<Cards> myCards, delCards, aCards;

    public int dnum, mnum;

    public JButton musica;


    public boolean Stay = false;
    public JLabel back;


    public int tot, deltot;

    public JLabel m1, m2, m3, m4, m5, d1, d2, d3, d4;
    private JButton hit, stay;

    public JTextArea bet;

    public int h;

    private JLabel yH, dH;

    public Music music = new Music();


    public Main() {
        this.setTitle("BJ");
        this.setSize(1000, 500);

        contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(1870, 1050));
        contentPane.setBackground(new Color(4, 99, 39));
        JScrollPane scrollFrame = new JScrollPane(contentPane);




        m1 = new JLabel();
        m2 = new JLabel();
        m3 = new JLabel();
        m4 = new JLabel();
        m5 = new JLabel();
        d1 = new JLabel();
        d2 = new JLabel();
        d3 = new JLabel();
        d4 = new JLabel();

        bet = new JTextArea();
        bet.setBounds(20, 50, 300, 150);
        bet.setOpaque(false);
        bet.setForeground(new Color(255, 255, 255));
        bet.setEnabled(true);
        bet.setFont(new Font("sansserif", 0, 30));
        bet.setVisible(true);

        bet.setText(String.format("Money: %s\nBet: ", 5000));


        yH = new JLabel();
        yH.setBounds(20, 700, 210, 70);
        yH.setOpaque(false);
        yH.setForeground(new Color(255, 255, 255));
        yH.setEnabled(true);
        yH.setFont(new Font("sansserif", 0, 30));
        yH.setText("Your Cards:");
        yH.setVisible(true);

        dH = new JLabel();
        dH.setBounds(20, 370, 260, 70);
        dH.setOpaque(false);
        dH.setForeground(new Color(255, 255, 255));
        dH.setEnabled(true);
        dH.setFont(new Font("sansserif", 0, 30));
        dH.setText("Dealers Cards:");
        dH.setVisible(true);

        String path = "/home/sina/IdeaProjects/BJ/" + "backbor" + ".jpg";
        ImageIcon icon = new ImageIcon(path);
        back = new JLabel();
        back.setBounds(0, 0, 1870, 1050);
        back.setIcon(icon);
        back.setEnabled(true);
        back.setVisible(true);


        hit = new JButton();
        hit.setBounds(750, 700, 100, 70);
        hit.setBackground(new Color(114, 7, 7));
        hit.setForeground(new Color(255, 255, 255));
        hit.setEnabled(true);
        hit.setFont(new Font("sansserif", 0, 30));
        hit.setText("HIT");
        hit.setVisible(true);
        hit.addActionListener(this);

        musica = new JButton();
        musica.setBounds(20, 200, 200, 70);
        musica.setBackground(new Color(114, 7, 7));
        musica.setForeground(new Color(255, 255, 255));
        musica.setEnabled(true);
        musica.setFont(new Font("sansserif", 0, 30));
        musica.setText("MUSIC");
        musica.setVisible(true);
        musica.addActionListener(this);

        stay = new JButton();
        stay.setBounds(850, 700, 200, 70);
        stay.setBackground(new Color(7, 53, 114));
        stay.setForeground(new Color(255, 255, 255));
        stay.setEnabled(true);
        stay.setFont(new Font("sansserif", 0, 30));
        stay.setText("STAY");
        stay.setVisible(true);
        stay.addActionListener(this);


        contentPane.add(bet);
        contentPane.add(stay);
        contentPane.add(hit);
        contentPane.add(yH);
        contentPane.add(dH);
        contentPane.add(musica);
        contentPane.add(back);

        contentPane.setAutoscrolls(true);
        scrollFrame.setPreferredSize(new Dimension(800, 300));
        this.add(scrollFrame);
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);

    }

    public static void main(String[] args) {



        Main window = new Main();


        ////Adds the cards to an arraylist to be randomly picked from

        window.aCards = new java.util.ArrayList<>();
        window.aCards.add(new Cards(11, "1S"));  //0
        window.aCards.add(new Cards(2, "2S"));
        window.aCards.add(new Cards(3, "3S"));
        window.aCards.add(new Cards(4, "4S"));
        window.aCards.add(new Cards(5, "5S"));
        window.aCards.add(new Cards(6, "6S"));
        window.aCards.add(new Cards(7, "7S"));
        window.aCards.add(new Cards(8, "8S"));
        window.aCards.add(new Cards(9, "9S"));
        window.aCards.add(new Cards(10, "10S"));
        window.aCards.add(new Cards(10, "11S"));
        window.aCards.add(new Cards(10, "12S"));
        window.aCards.add(new Cards(10, "13S"));  //12

        window.aCards.add(new Cards(11, "1C"));  //13
        window.aCards.add(new Cards(2, "2C"));
        window.aCards.add(new Cards(3, "3C"));
        window.aCards.add(new Cards(4, "4C"));
        window.aCards.add(new Cards(5, "5C"));
        window.aCards.add(new Cards(6, "6C"));
        window.aCards.add(new Cards(7, "7C"));
        window.aCards.add(new Cards(8, "8C"));
        window.aCards.add(new Cards(9, "9C"));
        window.aCards.add(new Cards(10, "10C"));
        window.aCards.add(new Cards(10, "11C"));
        window.aCards.add(new Cards(10, "12C"));
        window.aCards.add(new Cards(10, "13C"));  //25

        window.aCards.add(new Cards(11, "1H"));  //26
        window.aCards.add(new Cards(2, "2H"));
        window.aCards.add(new Cards(3, "3H"));
        window.aCards.add(new Cards(4, "4H"));
        window.aCards.add(new Cards(5, "5H"));
        window.aCards.add(new Cards(6, "6H"));
        window.aCards.add(new Cards(7, "7H"));
        window.aCards.add(new Cards(8, "8H"));
        window.aCards.add(new Cards(9, "9H"));
        window.aCards.add(new Cards(10, "10H"));
        window.aCards.add(new Cards(10, "11H"));
        window.aCards.add(new Cards(10, "12H"));
        window.aCards.add(new Cards(10, "13H"));  //38

        window.aCards.add(new Cards(11, "1D"));  //39
        window.aCards.add(new Cards(2, "2D"));
        window.aCards.add(new Cards(3, "3D"));
        window.aCards.add(new Cards(4, "4D"));
        window.aCards.add(new Cards(5, "5D"));
        window.aCards.add(new Cards(6, "6D"));
        window.aCards.add(new Cards(7, "7D"));
        window.aCards.add(new Cards(8, "8D"));
        window.aCards.add(new Cards(9, "9D"));
        window.aCards.add(new Cards(10, "10D"));
        window.aCards.add(new Cards(10, "11D"));
        window.aCards.add(new Cards(10, "12D"));
        window.aCards.add(new Cards(10, "13D")); //51


        window.aCards.add(new Cards(1, "1S"));
        window.aCards.add(new Cards(1, "1C"));
        window.aCards.add(new Cards(1, "1H"));
        window.aCards.add(new Cards(1, "1D"));


        int money = 5000;

        while (true) {

            //Reset values


            System.out.println("Your money" + money);


            window.aCards.get(0).setValue(11);
            window.aCards.get(13).setValue(11);
            window.aCards.get(26).setValue(11);
            window.aCards.get(39).setValue(11);

            window.remove(window.m1);
            window.remove(window.m2);
            window.remove(window.m3);
            window.remove(window.m4);
            window.remove(window.m5);
            window.remove(window.d1);
            window.remove(window.d2);
            window.remove(window.d3);
            window.remove(window.d4);

            String path = "/home/sina/IdeaProjects/BJ/" + "backbor" + ".png";
            ImageIcon icon = new ImageIcon(path);
            window.m1.setIcon(icon);
            window.m2.setIcon(icon);
            window.m3.setIcon(icon);
            window.m4.setIcon(icon);
            window.m5.setIcon(icon);
            window.d1.setIcon(icon);
            window.d2.setIcon(icon);
            window.d3.setIcon(icon);
            window.d4.setIcon(icon);


            window.revalidate();
            window.repaint();


            //Input bet

            int bet = 0;
            String bet1;

            for (int i = 0; i < 1; i++) {
                bet1 = (javax.swing.JOptionPane.showInputDialog("Enter Bet: "));
                bet = Integer.parseInt(bet1);
                System.out.println("Your bet is " + bet);
                if (bet < 50 || bet > money) {
                    i--;
                    JOptionPane.showMessageDialog(null, "Enter an amount above 50 and within your range!", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            window.bet.setText(String.format("Money: %s\nBet: %2d", money, bet));


            //randomly pick cards for user and dealers hand

            window.mnum = 2;
            window.dnum = 2;

            window.myCards = new ArrayList<>();
            window.myCards.add(window.aCards.get((int) (Math.random() * 51)));

            window.tot = 0;

            for (int i = 0; i < window.myCards.size(); i++) {
                window.tot += window.myCards.get(i).getValue();
            }


            int rannum = (int) (Math.random() * 51);

            if (window.tot > 10) {

                    if (rannum == 0) {
                        window.myCards.add(window.aCards.get(52));
                    } else if (rannum == 13) {
                        window.myCards.add(window.aCards.get(53));
                    } else if (rannum == 26) {
                        window.myCards.add(window.aCards.get(54));
                    } else if (rannum == 39) {
                        window.myCards.add(window.aCards.get(55));
                    }else{
                        window.myCards.add(window.aCards.get(rannum));
                    }

            }else{
                window.myCards.add(window.aCards.get(rannum));
            }





            window.delCards = new ArrayList<>();
            window.delCards.add(window.aCards.get((int) (Math.random() * 51)));

            rannum = (int) (Math.random() * 51);


            window.deltot = 0;

            for (int i = 0; i < window.delCards.size(); i++) {
                window.deltot += window.delCards.get(i).getValue();
            }

            if (window.deltot > 10) {

                if (rannum == 0) {
                    window.delCards.add(window.aCards.get(52));
                } else if (rannum == 13) {
                    window.delCards.add(window.aCards.get(53));
                } else if (rannum == 26) {
                    window.delCards.add(window.aCards.get(54));
                } else if (rannum == 39) {
                    window.delCards.add(window.aCards.get(55));
                }else{
                    window.delCards.add(window.aCards.get(rannum));
                }

            }else{
                window.delCards.add(window.aCards.get(rannum));
            }



            path = "/home/sina/IdeaProjects/BJ/POP/" + window.myCards.get(0).getName() + ".png";
            icon = new ImageIcon(path);
            window.m1.setIcon(icon);
            window.m1.setBounds(20, 820, 100, 145);
            window.m1.setVisible(true);
            window.contentPane.add(window.m1);
            path = "/home/sina/IdeaProjects/BJ/POP/" + window.myCards.get(1).getName() + ".png";
            icon = new ImageIcon(path);
            window.m2.setIcon(icon);
            window.m2.setBounds(140, 820, 100, 145);
            window.m2.setVisible(true);
            window.contentPane.add(window.m2);
            path = "/home/sina/IdeaProjects/BJ/POP/" + window.delCards.get(0).getName() + ".png";
            icon = new ImageIcon(path);
            window.d1.setIcon(icon);
            window.d1.setBounds(20, 465, 100, 145);
            window.d1.setVisible(true);
            window.contentPane.add(window.d1);
            window.contentPane.add(window.back);

            window.contentPane.setAutoscrolls(true);
            window.add(window.contentPane);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setLocationRelativeTo(null);
            window.pack();
            window.setVisible(true);



            window.deltot = 0;

            window.getTot();





            System.out.println(window.tot);


            //loop until user stays or busts

            while (!window.Stay) {

                window.getTot();



                //if user busts check to see if ace exists and sets value to 1

                if (window.tot > 21) {

                    for (int i = 0; i < window.myCards.size(); i++) {

                        if (window.myCards.get(i).getName().equals("1S")) {
                            window.myCards.set(i, window.aCards.get(52));
                            i+=10;
                        } else if (window.myCards.get(i).getName().equals("1C")) {
                            window.myCards.set(i, window.aCards.get(53));
                            i+=10;
                        } else if (window.myCards.get(i).getName().equals("1H")) {
                            window.myCards.set(i, window.aCards.get(54));
                            i+=10;
                        } else if (window.myCards.get(i).getName().equals("1D")) {
                            window.myCards.set(i, window.aCards.get(55));
                            i+=10;
                        }
                    }
                }

                window.getTot();





                if (window.tot > 21) {
                    break;
                }


            }


            window.getTot();

            System.out.println(window.tot);

            System.out.println("Your Cards: ");
            for (Cards x : window.myCards) {
                System.out.println(x.getValue());
            }
            System.out.println("__________");

            //busting screen

            if (window.tot > 21) {
                simpleSoundPlayer.play("/home/sina/IdeaProjects/BJ/Sounds/lose.wav");
                JOptionPane.showMessageDialog(null, "You Busted", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Your money is " + (money-bet));
                money-=bet;
                continue;
            }



            window.Stay = false;

            path = "/home/sina/IdeaProjects/BJ/POP/" + window.delCards.get(1).getName() + ".png";
            icon = new ImageIcon(path);
            window.d2.setIcon(icon);
            window.d2.setBounds(140, 465, 100, 145);
            window.d2.setVisible(true);
            window.contentPane.add(window.d2);
            window.contentPane.add(window.back);

            window.contentPane.setAutoscrolls(true);
            window.add(window.contentPane);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setLocationRelativeTo(null);
            window.pack();
            window.setVisible(true);

            System.out.println(window.myCards);



            window.deltot = 0;

            for (int i = 0; i < window.delCards.size(); i++) {
                window.deltot += window.delCards.get(i).getValue();
            }
            System.out.println("del val" + window.deltot);



            window.deltot = 0;

            for (Cards x : window.delCards) {
                window.deltot += x.getValue();
            }

            System.out.println(window.deltot);



            if (window.tot > 21) {

                for (int i = 0; i < 2; i++) {

                    if (window.myCards.get(i).getName() == "1S") {
                        window.myCards.set(i, window.aCards.get(52));
                    } else if (window.myCards.get(i).getName() == "1C") {
                        window.myCards.set(i, window.aCards.get(53));
                    } else if (window.myCards.get(i).getName() == "1H") {
                        window.myCards.set(i, window.aCards.get(54));
                    } else if (window.myCards.get(i).getName() == "1D") {
                        window.myCards.set(i, window.aCards.get(55));
                    }
                }
            }
            int f = 1;

            //dealers hand and hits and stay

            while (window.deltot < 17) {

                rannum = (int) (Math.random() * 51);

                window.deltot = 0;

                for (int i = 0; i < window.delCards.size(); i++) {
                    window.deltot += window.delCards.get(i).getValue();
                }



                if (window.deltot > 10) {

                    if (rannum == 0) {
                        window.delCards.add(window.aCards.get(52));
                    } else if (rannum == 13) {
                        window.delCards.add(window.aCards.get(53));
                    } else if (rannum == 26) {
                        window.delCards.add(window.aCards.get(54));
                    } else if (rannum == 39) {
                        window.delCards.add(window.aCards.get(55));
                    }else{
                        window.delCards.add(window.aCards.get(rannum));
                    }

                }else{
                    window.delCards.add(window.aCards.get(rannum));
                }

                f++;
                if (f == 2) {
                    path = "/home/sina/IdeaProjects/BJ/POP/" + window.delCards.get(f).getName() + ".png";
                    icon = new ImageIcon(path);
                    window.d3.setIcon(icon);
                    window.d3.setBounds(260, 465, 100, 145);
                    window.d3.setVisible(true);
                    window.contentPane.add(window.d3);
                    window.contentPane.add(window.back);

                    window.contentPane.setAutoscrolls(true);
                    window.add(window.contentPane);
                    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    window.setLocationRelativeTo(null);
                    window.pack();
                    window.setVisible(true);
                } else if (f == 3) {
                    path = "/home/sina/IdeaProjects/BJ/POP/" + window.delCards.get(f).getName() + ".png";
                    icon = new ImageIcon(path);
                    window.d4.setIcon(icon);
                    window.d4.setBounds(380, 465, 100, 145);
                    window.d4.setVisible(true);
                    window.contentPane.add(window.d4);
                    window.contentPane.add(window.back);

                    window.contentPane.setAutoscrolls(true);
                    window.add(window.contentPane);
                    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    window.setLocationRelativeTo(null);
                    window.pack();
                    window.setVisible(true);
                }

                window.deltot = 0;

                for (Cards x : window.delCards) {
                    window.deltot += x.getValue();
                }

                if (window.deltot > 21) {

                    for (int i = 0; i < 2; i++) {

                        if (window.delCards.get(i).getName() == "1S") {
                            window.delCards.set(i, window.aCards.get(52));
                        } else if (window.delCards.get(i).getName() == "1C") {
                            window.delCards.set(i, window.aCards.get(53));
                        } else if (window.delCards.get(i).getName() == "1H") {
                            window.delCards.set(i, window.aCards.get(54));
                        } else if (window.delCards.get(i).getName() == "1D") {
                            window.delCards.set(i, window.aCards.get(55));
                        }
                    }
                }


            }

            System.out.println(window.deltot);


            //checks who won


            if (window.deltot < 22) {
                if (window.deltot < window.tot) {
                    simpleSoundPlayer.play("/home/sina/IdeaProjects/BJ/Sounds/win.wav");
                    JOptionPane.showMessageDialog(null, "You Won", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
                    money += bet;
                } else if (window.tot < window.deltot) {
                    simpleSoundPlayer.play("/home/sina/IdeaProjects/BJ/Sounds/lose.wav");
                    JOptionPane.showMessageDialog(null, "You Lost", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
                    money -= bet;
                } else if (window.tot == window.deltot) {
                    simpleSoundPlayer.play("/home/sina/IdeaProjects/BJ/Sounds/meh.wav");
                    JOptionPane.showMessageDialog(null, "Push", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                simpleSoundPlayer.play("/home/sina/IdeaProjects/BJ/Sounds/win.wav");
                JOptionPane.showMessageDialog(null, "You Won", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
                money += bet;
            }


        }


    }

    @Override
    public void actionPerformed(ActionEvent evt) {



        //music

        if (evt.getSource() == musica) {
            music.run();


        }

        //hit and stay logic


        if (evt.getSource() == hit) {

            System.out.println("Your Cards: ");
            for (Cards x : myCards) {
                System.out.println(x.getValue());
            }
            System.out.println("__________");

            int rannum = (int) (Math.random() * 51);

            getTot();
            getTot();

            System.out.println("why is ur cards pooping: " + myCards.size());

            System.out.println("why is ur cards: " + tot);

            if(tot > 10) {
                if (rannum == 0) {
                    myCards.add(aCards.get(52));
                } else if (rannum == 13) {
                    myCards.add(aCards.get(53));
                } else if (rannum == 26) {
                    myCards.add(aCards.get(54));
                } else if (rannum == 39) {
                    myCards.add(aCards.get(55));
                } else {
                    myCards.add(aCards.get(rannum));
                }
            }else{
                myCards.add(aCards.get(rannum));
            }

            tot = 0;

            for (int i = 0; i < myCards.size(); i++) {
                tot += myCards.get(i).getValue();
            }




            if (mnum == 2) {
                mnum++;
                String path = "/home/sina/IdeaProjects/BJ/POP/" + myCards.get(2).getName() + ".png";
                ImageIcon icon = new ImageIcon(path);
                m3.setIcon(icon);
                m3.setBounds(260, 820, 100, 145);
                m3.setVisible(true);
                contentPane.add(m3);

            } else if (mnum == 3) {
                mnum++;
                String path = "/home/sina/IdeaProjects/BJ/POP/" + myCards.get(3).getName() + ".png";
                ImageIcon icon = new ImageIcon(path);
                m4.setIcon(icon);
                m4.setBounds(380, 820, 100, 145);
                m4.setVisible(true);
                contentPane.add(m4);

            } else if (mnum == 4) {
                mnum++;
                String path = "/home/sina/IdeaProjects/BJ/POP/" + myCards.get(4).getName() + ".png";
                ImageIcon icon = new ImageIcon(path);
                m5.setIcon(icon);
                m5.setBounds(500, 820, 100, 145);
                m5.setVisible(true);
                contentPane.add(m5);

            }
            contentPane.add(back);

            getTot();



            //if user busts check to see if ace exists and sets value to 1

            if (tot > 21) {

                for (int i = 0; i < myCards.size(); i++) {

                    if (myCards.get(i).getName().equals("1S")) {
                        myCards.set(i, aCards.get(52));
                        i+=10;
                    } else if (myCards.get(i).getName().equals("1C")) {
                        myCards.set(i, aCards.get(53));
                        i+=10;
                    } else if (myCards.get(i).getName().equals("1H")) {
                        myCards.set(i, aCards.get(54));
                        i+=10;
                    } else if (myCards.get(i).getName().equals("1D")) {
                        myCards.set(i, aCards.get(55));
                        i+=10;
                    }
                }
            }

            System.out.println(tot);

            contentPane.setAutoscrolls(true);
            this.add(contentPane);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.pack();
            this.setVisible(true);

        } else if (evt.getSource() == stay) {
            Stay = true;
            System.out.println("hello");
        }
    }

    public void getTot() {
        tot = 0;

        for (int i = 0; i < myCards.size(); i++) {
            tot = tot + myCards.get(i).getValue();
        }
    }





}
