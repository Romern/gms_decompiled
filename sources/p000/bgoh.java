package p000;

import com.google.android.gms.location.FloorChangeEvent;
import java.util.List;

/* renamed from: bgoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgoh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bgoi f116913a;

    /* renamed from: b */
    final /* synthetic */ buhd f116914b;

    public bgoh(bgoi bgoi, buhd buhd) {
        this.f116913a = bgoi;
        this.f116914b = buhd;
    }

    public final void run() {
        bgoi bgoi = this.f116913a;
        buhd buhd = this.f116914b;
        int a = bufp.m119413a(buhd.f153831a);
        int i = a - 1;
        if (a == 0) {
            throw null;
        } else if (i != 66) {
            int i2 = buhd.f153831a;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown message type: ");
            sb.append(i2);
            sb.toString();
        } else {
            buep buep = (buep) buhd.mo72661a((bxxk) buep.f153617f.mo74142c(7));
            int a2 = bueo.m119386a(buep.f153619a);
            int i3 = 1;
            if (a2 == 0) {
                a2 = 1;
            }
            String valueOf = String.valueOf(Integer.toString(a2 - 1));
            float f = buep.f153620b;
            int i4 = buep.f153622d;
            int i5 = buep.f153623e;
            float f2 = buep.f153621c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 101);
            sb2.append("HandleFloorChange: type=");
            sb2.append(valueOf);
            sb2.append(", conf=");
            sb2.append(f);
            sb2.append(", time=[");
            sb2.append(i4);
            sb2.append(", ");
            sb2.append(i5);
            sb2.append("], elev=");
            sb2.append(f2);
            sb2.toString();
            int i6 = buep.f153622d;
            int i7 = buep.f153623e;
            if (i6 > i7) {
                StringBuilder sb3 = new StringBuilder(56);
                sb3.append("bad event, startTime(");
                sb3.append(i6);
                sb3.append(") > endTime(");
                sb3.append(i7);
                sb3.append(")");
                sb3.toString();
                return;
            }
            List list = bgoi.f116915a;
            if (list != null && !list.isEmpty()) {
                List list2 = bgoi.f116915a;
                int size = list2.size();
                int i8 = 0;
                while (i8 < size) {
                    bgmy bgmy = (bgmy) list2.get(i8);
                    int a3 = bueo.m119386a(buep.f153619a);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    int i9 = a3 - 1;
                    int i10 = 3;
                    if (i9 == i3) {
                        i10 = 1;
                    } else if (i9 == 2) {
                        i10 = 2;
                    } else if (i9 != 3) {
                        StringBuilder sb4 = new StringBuilder(51);
                        sb4.append("Invalid floor change type from nanoapp: ");
                        sb4.append(i9);
                        sb4.toString();
                        i10 = 0;
                    }
                    int round = Math.round(buep.f153620b * 100.0f);
                    int i11 = 100;
                    if (round < 0) {
                        i11 = 0;
                    } else if (round <= 100) {
                        i11 = round;
                    }
                    bgmy.mo60968a(new FloorChangeEvent(i10, i11, ((long) buep.f153622d) + bgof.m99492e(), ((long) buep.f153623e) + bgof.m99492e(), (long) buep.f153622d, (long) buep.f153623e, buep.f153621c));
                    i8++;
                    list2 = list2;
                    buep = buep;
                    i3 = 1;
                }
            }
        }
    }
}
