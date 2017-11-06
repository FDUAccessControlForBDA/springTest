package service.fdu_ac_service.model;

public class Rule {
	
	// ����һ���������ڱ�ʾĳ���û��ܷ����ĳ�����ݱ�
    private long userId;
    private String userName;
    private int type;
    private int status;

    public Rule(){}

    public Rule (long userId, String userName, int type, int status){
        this.setUserId(userId);
        this.setUserName(userName);
        this.setType(type);
        this.setStatus(status);
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
	
}
