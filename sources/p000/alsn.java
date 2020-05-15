package p000;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: alsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alsn extends dcj implements alsp {
    public alsn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.contactssync.internal.IContactsSyncService");
    }

    /* renamed from: a */
    public final void mo40713a(alss alss) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alss);
        mo8528b(192805, bj);
    }

    /* renamed from: a */
    public final void mo40714a(alss alss, Uri uri) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40716a(alss alss, List list, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40717a(alss alss, int[] iArr) {
        throw null;
    }

    /* renamed from: b */
    public final void mo40718b(alss alss) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alss);
        mo8528b(192806, bj);
    }

    /* renamed from: b */
    public final void mo40719b(alss alss, int[] iArr) {
        throw null;
    }

    /* renamed from: c */
    public final void mo40720c(alss alss) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alss);
        mo8528b(192807, bj);
    }

    /* renamed from: a */
    public final void mo40715a(alss alss, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alss);
        bj.writeString(str);
        mo8528b(192802, bj);
    }
}
