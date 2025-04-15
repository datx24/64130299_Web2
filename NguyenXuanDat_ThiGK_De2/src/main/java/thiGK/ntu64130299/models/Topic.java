package thiGK.ntu64130299.models;

public class Topic {
	public String id;
	public String topicName;
	public String topicDescription;
	public String supervisorId;
	public String topicType;
	
	public Topic() {}
	
	public Topic(String id, String topicName, String supervisorId, String topicType) {
		super();
		this.id = id;
		this.topicName = topicName;
		this.supervisorId = supervisorId;
		this.topicType = topicType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}

	public String getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}

	public String getTopicType() {
		return topicType;
	}

	public void setTopicType(String topicType) {
		this.topicType = topicType;
	}
	
}
