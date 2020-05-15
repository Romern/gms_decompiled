package p000;

import android.net.wifi.RttManager;
import java.util.List;

/* renamed from: bgkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgkd implements RttManager.RttListener {

    /* renamed from: a */
    final /* synthetic */ bgke f116690a;

    /* renamed from: b */
    private final List f116691b;

    public bgkd(bgke bgke, List list) {
        this.f116690a = bgke;
        this.f116691b = list;
    }

    public final void onAborted() {
        int i = bgke.f116692c;
        this.f116690a.f116693a.mo62905a(this.f116691b, null);
    }

    public final void onFailure(int i, String str) {
        int i2 = bgke.f116692c;
        StringBuilder sb = new StringBuilder(39);
        sb.append("listener failure, reason is ");
        sb.append(i);
        sb.toString();
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("listener failure, description is ");
        } else {
            "listener failure, description is ".concat(valueOf);
        }
        this.f116690a.f116693a.mo62905a(this.f116691b, null);
    }

    public final void onSuccess(RttManager.RttResult[] rttResultArr) {
        bgkx bgkx;
        int i;
        int i2;
        RttManager.RttResult[] rttResultArr2 = rttResultArr;
        int i3 = bgke.f116692c;
        int length = rttResultArr2.length;
        StringBuilder sb = new StringBuilder(55);
        sb.append("listener success, RttResult array is length ");
        sb.append(length);
        sb.toString();
        for (RttManager.RttResult rttResult : rttResultArr2) {
            if (rttResult != null) {
                int i4 = rttResult.distance;
                StringBuilder sb2 = new StringBuilder(35);
                sb2.append("rtt result, distance is ");
                sb2.append(i4);
                sb2.toString();
            }
        }
        List list = this.f116691b;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            bgkf[] bgkfArr = (bgkf[]) list.get(i5);
            int length2 = bgkfArr.length;
            int i7 = 0;
            while (true) {
                i2 = i5 + 1;
                if (i7 >= length2) {
                    break;
                }
                i6 += bgkfArr[i7].f116702f ? 1 : 0;
                i7++;
            }
            i5 = i2;
        }
        int length3 = rttResultArr2.length;
        bfnz[] bfnzArr = new bfnz[length3];
        bgkx bgkx2 = bgkx.f116729g;
        int i8 = 0;
        while (i8 < rttResultArr2.length) {
            RttManager.RttResult rttResult2 = rttResultArr2[i8];
            bfnz a = bgkx2.mo62953a(rttResult2);
            if (a != null) {
                long a2 = bupz.m120219a(rttResult2.bssid);
                List list2 = this.f116691b;
                int size2 = list2.size();
                int i9 = 0;
                int i10 = -1;
                while (i9 < size2) {
                    bgkf[] bgkfArr2 = (bgkf[]) list2.get(i9);
                    int length4 = bgkfArr2.length;
                    bgkx bgkx3 = bgkx2;
                    int i11 = 0;
                    while (true) {
                        i = i9 + 1;
                        if (i11 >= length4) {
                            break;
                        }
                        List list3 = list2;
                        bgkf bgkf = bgkfArr2[i11];
                        int i12 = size2;
                        int i13 = length4;
                        if (a2 == bgkf.f116698b) {
                            i10 = bgkf.f116701e;
                        }
                        i11++;
                        list2 = list3;
                        size2 = i12;
                        length4 = i13;
                    }
                    bgkx2 = bgkx3;
                    i9 = i;
                }
                bgkx = bgkx2;
                if (i10 != -1) {
                    a.f114538j = i10;
                }
                bfnzArr[i8] = a;
            } else {
                bgkx = bgkx2;
            }
            i8++;
            bgkx2 = bgkx;
        }
        bfor bfor = this.f116690a.f116694b;
        bfor.mo62047a(new bfoq(bfos.RTT_SCAN_RESULTS, bfor.mo62055b(), "attempted=%2$d, success=%3$d", null, i6, length3, -1));
        this.f116690a.f116693a.mo62905a(this.f116691b, bfnzArr);
    }
}
