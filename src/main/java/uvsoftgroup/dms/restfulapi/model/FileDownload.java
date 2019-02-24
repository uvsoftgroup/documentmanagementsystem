package uvsoftgroup.dms.restfulapi.model;

public class FileDownload {
	    private Long fdId;
		private String fdName;
		private String fdType;
		private byte[] fdContent;
		private Long fdSize;
		
		public Long getFdId() {
			return fdId;
		}
		public void setFdId(Long fdId) {
			this.fdId = fdId;
		}
		public String getFdName() {
			return fdName;
		}
		public void setFdName(String fdName) {
			this.fdName = fdName;
		}
		public String getFdType() {
			return fdType;
		}
		public void setFdType(String fdType) {
			this.fdType = fdType;
		}
		public byte[] getFdContent() {
			return fdContent;
		}
		public void setFdContent(byte[] fdContent) {
			this.fdContent = fdContent;
		}
		public Long getFdSize() {
			return fdSize;
		}
		public void setFdSize(Long fdSize) {
			this.fdSize = fdSize;
		}
		
}
