package com.google.location.bluemoon.inertialanchor;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InertialAnchorBase {

    /* renamed from: g */
    public NativeJniWrapper f191728g = null;

    /* renamed from: h */
    public final List f191729h = new ArrayList();

    /* renamed from: i */
    protected final btvy f191730i;

    /* renamed from: j */
    protected final btvx f191731j;

    /* renamed from: k */
    protected volatile long f191732k = 0;

    /* renamed from: l */
    protected final Object f191733l = new Object();

    /* renamed from: m */
    protected btvp f191734m = null;

    protected InertialAnchorBase(btvy btvy, btvx btvx) {
        System.loadLibrary("inertial-anchor-jni");
        this.f191728g = new NativeJniWrapper();
        this.f191730i = btvy;
        this.f191731j = btvx;
    }

    /* renamed from: a */
    public final void mo86645a(btvl btvl) {
        synchronized (this.f191729h) {
            this.f191729h.remove(btvl);
        }
    }

    /* renamed from: a */
    public void mo86635a(PrintWriter printWriter) {
    }

    /* renamed from: e */
    public final long mo86647e() {
        byte[] bArr;
        synchronized (this.f191733l) {
            if (this.f191732k != 0) {
                long j = this.f191732k;
                return j;
            }
            if (this.f191730i == null) {
                this.f191732k = this.f191728g.newDefaultOnlineEstimator();
            } else {
                btvx btvx = this.f191731j;
                if (btvx != null) {
                    bArr = btvx.mo73642k();
                } else {
                    bArr = null;
                }
                this.f191732k = this.f191728g.newOnlineEstimatorWithConfig(this.f191730i.mo73642k(), bArr);
            }
            if (this.f191732k != 0) {
                long j2 = this.f191732k;
                return j2;
            }
            throw new OutOfMemoryError();
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        synchronized (this.f191733l) {
            if (this.f191732k != 0) {
                this.f191728g.deleteOnlineEstimator(this.f191732k);
                this.f191732k = 0;
            }
        }
        super.finalize();
    }

    /* renamed from: a */
    public final void mo86646a(btwc btwc) {
        this.f191728g.configureMetadata(mo86647e(), btwc.mo73642k());
    }
}
