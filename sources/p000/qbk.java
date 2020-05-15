package p000;

import com.android.media.remotedisplay.RemoteDisplay;
import com.google.android.gms.cast.CastDevice;

/* renamed from: qbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qbk extends alm {

    /* renamed from: a */
    final /* synthetic */ qbn f40871a;

    public qbk(qbn qbn) {
        this.f40871a = qbn;
    }

    /* renamed from: d */
    private final void m31793d(alv alv) {
        CastDevice b = CastDevice.m22257b(alv.f883l);
        if (b != null && b.mo17500e()) {
            String str = alv.f876e;
            RemoteDisplay findRemoteDisplay = this.f40871a.findRemoteDisplay(b.mo17494a());
            if (findRemoteDisplay == null) {
                RemoteDisplay remoteDisplay = new RemoteDisplay(b.mo17494a(), alv.f875d);
                remoteDisplay.setDescription(str);
                remoteDisplay.setStatus(2);
                this.f40871a.addDisplay(remoteDisplay);
            } else if (!ptk.m31236a(str, findRemoteDisplay.getDescription())) {
                findRemoteDisplay.setDescription(str);
                this.f40871a.updateDisplay(findRemoteDisplay);
            }
        }
    }

    /* renamed from: a */
    public final void mo980a(alv alv) {
        m31793d(alv);
    }

    /* renamed from: b */
    public final void mo981b(alv alv) {
        m31793d(alv);
    }

    /* renamed from: c */
    public final void mo982c(alv alv) {
        RemoteDisplay findRemoteDisplay;
        CastDevice b = CastDevice.m22257b(alv.f883l);
        if (b != null && b.mo17500e() && (findRemoteDisplay = this.f40871a.findRemoteDisplay(b.mo17494a())) != null) {
            this.f40871a.removeDisplay(findRemoteDisplay);
        }
    }
}
