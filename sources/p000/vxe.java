package p000;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;

/* renamed from: vxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class vxe {

    /* renamed from: c */
    final String f50178c;

    /* renamed from: d */
    final DroidGuardResultsRequest f50179d;

    /* renamed from: e */
    final vxu f50180e;

    /* renamed from: f */
    boolean f50181f = false;

    public vxe(String str, DroidGuardResultsRequest droidGuardResultsRequest) {
        vxw vxw;
        int i = 0;
        this.f50178c = str;
        if (droidGuardResultsRequest == null) {
            this.f50179d = new DroidGuardResultsRequest();
        } else {
            this.f50179d = droidGuardResultsRequest;
        }
        if (cdqy.m134715b()) {
            String[] split = cdqy.f181583a.mo6606a().mo78199b().split(",");
            int length = split.length;
            while (true) {
                if (i < length) {
                    if (str.equals(split[i])) {
                        vxw = vxw.FINE;
                        break;
                    }
                    i++;
                } else {
                    vxw = vxw.COARSE;
                    break;
                }
            }
            this.f50180e = new vxx(vxw);
            return;
        }
        this.f50180e = new vxk();
    }

    /* renamed from: a */
    private final synchronized void mo28922a(vvq vvq) {
        if (!this.f50181f) {
            this.f50181f = true;
            try {
                mo28924b(vvq);
            } catch (Exception e) {
            }
        } else {
            vvq.mo28907b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28924b(vvq vvq) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo28925c(vvq vvq) {
        if (cdqv.f181580a.mo6606a().mo78196a()) {
            synchronized (this) {
                if (!this.f50181f) {
                    this.f50181f = true;
                    try {
                        mo28924b(vvq);
                    } catch (Exception e) {
                    }
                } else {
                    vvq.mo28907b();
                }
            }
        } else {
            mo28922a(vvq);
        }
    }
}
