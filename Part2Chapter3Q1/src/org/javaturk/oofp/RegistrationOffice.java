package org.javaturk.oofp;

public class RegistrationOffice {

    public static void main(String[] args) {
        RegistrationOffice office = new RegistrationOffice();
        PhdStudent phdStudent = new PhdStudent(0, null, 0, null, null, null, false);
        MasterStudent masterStudent = new MasterStudent(0, null, 0, null, null, null);
        GraduateStudent graduateStudent = new GraduateStudent(0, null, 0, null, null, null);
        VocationalStudent vocationalStudent = new VocationalStudent(0, null, 0, null);
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent(0, null, 0, null, null);
        office.registerStudent(phdStudent);
        office.registerStudent(masterStudent);
        office.registerStudent(graduateStudent);
        office.registerStudent(vocationalStudent);
        office.registerStudent(undergraduateStudent);
    }

    public void registerStudent(Student student) {
        if (student instanceof VocationalStudent) {
            VocationalStudent v = (VocationalStudent) student;
            v.register();
            System.out.println(v.getName() + " is a vocational student.");
            System.out.println(v.toString());


        } else if (student instanceof UndergraduateStudent) {
            UndergraduateStudent u = (UndergraduateStudent) student;
            u.register();
            System.out.println(u.getName() + " is a undergraduate student.");
            System.out.println(u.toString());

        }
        else if (student instanceof GraduateStudent) {
            if (student instanceof PhdStudent) {
                PhdStudent p = (PhdStudent) student;
                if (p.qualifyingExamTaken) {
                    p.register();
                    System.out.println(p.toString());
                } else {
                    System.out.println("Registration of student who have NOT " + p.getName() + " name has completed.");
                }
            } else if (student instanceof MasterStudent) {
                MasterStudent m = (MasterStudent) student;
                m.register();
                System.out.println(m.getName() + " is a master student.");
                System.out.println(m.toString());
            }
        }
    }
}