/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class torrent {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected torrent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(torrent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_torrent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean is_aborted() {
    return libtorrent_jni.torrent_is_aborted(swigCPtr, this);
  }

  public int queue_position() {
    return libtorrent_jni.torrent_queue_position(swigCPtr, this);
  }

}
