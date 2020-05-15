package p000;

import android.os.ParcelFileDescriptor;

/* renamed from: zyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zyp implements bnce {
    /* renamed from: a */
    public final void mo31604a(bncf bncf) {
        try {
            ((ParcelFileDescriptor) bncf.getValue()).close();
        } catch (Exception e) {
            zyh.m46681a("FontsContentProvider", e, "PFD could not be closed.", new Object[0]);
        }
    }
}
