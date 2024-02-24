package com.company.project.lesson07.task01;

public class Group {
    private boolean isUnderway;
    private Mountain mountain;
    private Alpinist[] crew;

    public Group(Mountain mountain) {
        this.mountain = mountain;
        this.crew = new Alpinist[3];
        isUnderway = true;
    }
    public boolean isUnderway() {
        if(isUnderway) System.out.println("Набор открыт");
        else System.out.println("Набор закрыт");
        return isUnderway;
    }
    public void addMember(Alpinist alpinist) {
        if (alpinist==null)throw new IllegalArgumentException("Alpinist not null");
        if (isUnderway) {
            for (int i = 0; i < crew.length; i++) {
                if (crew[i] == null) {
                    crew[i] = alpinist;
                    System.out.println("Участник добавлен в групппу");
                    break;
                }
            }
            if(crew[crew.length-1] != null)isUnderway=false;

        }else System.out.println("Невозможно добвить. Группа уже заполнена");
    }
}
