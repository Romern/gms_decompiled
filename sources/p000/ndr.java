package p000;

import android.content.Context;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: ndr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class ndr {

    /* renamed from: a */
    public int f35358a;

    public ndr() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if ((r0 & 32) != 0) goto L_0x0036;
     */
    /* renamed from: a */
    public final void mo20495a(Context context, bxvd bxvd, mqj mqj) {
        if (ccnf.f179489a.mo6606a().mo76411E()) {
            if (ccmk.m130673e()) {
                mqk mqk = (mqk) bxvd.mo74062i();
                if (mqk != null) {
                    int i = mqk.f34284a;
                    if ((i & 4) == 0) {
                        if ((i & 8) == 0) {
                            if ((i & 16) == 0) {
                            }
                        }
                    }
                }
                Log.e("BackupRestoreLogManager", "Trying to log invalid backup event.");
                return;
            }
            int g = (int) ccnf.m130738g();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            mqk mqk2 = (mqk) bxvd.f164949b;
            mqk mqk3 = mqk.f34276G;
            mqk2.f34284a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            mqk2.f34304u = g;
            qwo a = new qws(context, "ANDROID_BACKUP", null).mo24335a(((mqk) bxvd.mo74062i()).serializeToBytes());
            a.mo24328b(mqj.f34275R);
            a.mo24323a((long) this.f35358a);
            a.mo24327b();
        }
    }

    public ndr(int i) {
        this.f35358a = i;
    }
}
