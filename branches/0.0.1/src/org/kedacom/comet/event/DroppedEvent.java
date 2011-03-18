package org.kedacom.comet.event;

import org.kedacom.comet.CometConnection;
import org.kedacom.comet.CometEngine;
import org.kedacom.event.Event;


public class DroppedEvent extends Event<CometEngine> {
	private CometConnection conn;
	public DroppedEvent(CometEngine target,CometConnection aConn) {
		super(target);
		conn = aConn;
	}
	public CometConnection getConn() {
		return conn;
	}
	public void setConn(CometConnection conn) {
		this.conn = conn;
	}
	public void destroy() {
		super.destroy();
		conn = null;
	}
}