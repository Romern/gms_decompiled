package p000;

import android.view.MotionEvent;
import android.view.Surface;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.car.display.CarDisplayId;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/* renamed from: noe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class noe implements oaa, nlt, opy {

    /* renamed from: a */
    public final CarDisplayId f36140a;

    /* renamed from: b */
    public oad f36141b;

    /* renamed from: c */
    public oqa f36142c;

    /* renamed from: d */
    public nlv f36143d;

    /* renamed from: e */
    final /* synthetic */ noj f36144e;

    /* renamed from: f */
    public final int f36145f;

    /* renamed from: g */
    public final oan f36146g = new oan(this);

    public noe(noj noj, CarDisplayId carDisplayId, int i) {
        this.f36144e = noj;
        this.f36140a = carDisplayId;
        this.f36145f = i;
    }

    /* renamed from: a */
    public final void mo21064a(MotionEvent motionEvent) {
        this.f36144e.f36225l.post(new nob(this, motionEvent));
    }

    /* renamed from: b */
    public final void mo21068b(MotionEvent motionEvent) {
        this.f36144e.f36225l.post(new noc(this, motionEvent));
    }

    /* renamed from: c */
    public final boolean mo21233c() {
        return this.f36144e.mo21344n() == this;
    }

    /* renamed from: d */
    public final void mo21234d() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r3.f36144e.f36159D.mo22051a(r3.f36142c);
        r4 = r3.f36144e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r3.f36140a.equals(com.google.android.gms.car.display.CarDisplayId.f29492a) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        r4.f36225l.removeCallbacks(r4.f36175T);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r4 = r4.mo21194g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        r4.mo20839l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r3.f36142c.mo21668a(r4) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r3.f36144e.mo21273a(p000.bpdn.COMPOSITION, p000.bpdo.COMPOSITION_INIT_FAIL, "Starting composition failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo21226a(Surface surface) {
        noj noj = this.f36144e;
        bnsn bnsn = noj.f36155b;
        synchronized (noj.f36227n) {
            if (!this.f36144e.f36230q) {
            }
        }
    }

    /* renamed from: b */
    public final boolean mo21232b() {
        noj noj = this.f36144e;
        bnsn bnsn = noj.f36155b;
        return noj.f36177V;
    }

    /* renamed from: a */
    public final void mo21065a(biro biro) {
        mo21066a(biro, 0, 0);
    }

    /* renamed from: a */
    public final void mo21066a(biro biro, int i, int i2) {
        bpea bpea;
        int i3 = biro.f121436b;
        bnsn bnsn = noj.f36155b;
        if (i3 == 3) {
            bpea = bpea.KEY_EVENT_KEYCODE_HOME;
        } else if (i3 == 84) {
            bpea = bpea.KEY_EVENT_KEYCODE_SEARCH;
        } else if (i3 == 209) {
            bpea = bpea.KEY_EVENT_KEYCODE_MUSIC;
        } else if (i3 != 65540) {
            switch (i3) {
                case 65537:
                    bpea = bpea.KEY_EVENT_KEYCODE_MEDIA;
                    break;
                case 65538:
                    bpea = bpea.KEY_EVENT_KEYCODE_NAVIGATION;
                    break;
                default:
                    bpea = bpea.KEY_EVENT_KEYCODE_UNHANDLED;
                    break;
            }
        } else {
            bpea = bpea.KEY_EVENT_KEYCODE_TEL;
        }
        bnsi d = noj.f36155b.mo68390d();
        d.mo68432a("noe", "a", 374, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68427a("onKeyEvent display=%d uiAction=%d down=%b longpress=%d repeatcount=%d", Integer.valueOf(this.f36140a.f29493b), Integer.valueOf(bpea.f137033jW), Boolean.valueOf(biro.f121437c), Integer.valueOf(i), Integer.valueOf(i2));
        this.f36144e.f36225l.post(new nod(this, biro, bpea, i, i2));
    }

    /* renamed from: a */
    public final void mo21227a(PrintWriter printWriter) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        String str;
        PrintWriter printWriter2 = printWriter;
        oad oad = this.f36141b;
        if (oad != null) {
            printWriter2.println("\nDisplaySourceService");
            oad.mo20649a(printWriter2);
        }
        oqa oqa = this.f36142c;
        if (oqa != null) {
            printWriter2.println("\nProjectionWindowManager");
            nvk nvk = (nvk) oqa;
            int i = nvk.f36675u;
            int i2 = nvk.f36673s;
            int i3 = nvk.f36674t;
            boolean z = nvk.f36672r;
            boolean z2 = nvk.f36676v;
            int i4 = nvk.f36677w;
            StringBuilder sb = new StringBuilder(161);
            sb.append("current frame rate:");
            sb.append(i);
            sb.append("max frame rate:");
            sb.append(i2);
            sb.append("fixed frame rate:");
            sb.append(i3);
            sb.append(" dynamic frame rate:");
            sb.append(!z);
            sb.append(" restrictTo30fps:");
            sb.append(z2);
            sb.append(" decoder add depth:");
            sb.append(i4);
            printWriter2.println(sb.toString());
            boolean z3 = nvk.f36678x;
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("power saving mode ");
            sb2.append(z3);
            printWriter2.println(sb2.toString());
            int i5 = nvk.f36605F.get();
            StringBuilder sb3 = new StringBuilder(26);
            sb3.append("Frames to send ");
            sb3.append(i5);
            printWriter2.println(sb3.toString());
            int i6 = nvk.f36607H;
            int i7 = nvk.f36608I;
            int i8 = nvk.f36609J;
            int i9 = nvk.f36610K;
            StringBuilder sb4 = new StringBuilder((int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE);
            sb4.append("total frames:");
            sb4.append(i6 + i7 + i8 + i9);
            sb4.append(" normal frames:");
            sb4.append(i6);
            sb4.append(" idle frames:");
            sb4.append(i7);
            sb4.append(" drop by timer:");
            sb4.append(i8);
            sb4.append(" drop by ack:0 drop by queue overflow:");
            sb4.append(i9);
            printWriter2.println(sb4.toString());
            nvk.f36607H = 0;
            nvk.f36608I = 0;
            nvk.f36609J = 0;
            printWriter2.println("num renderings per num windows:");
            for (int i10 = 0; i10 < 6; i10++) {
                int i11 = nvk.f36611L[i10];
                StringBuilder sb5 = new StringBuilder(23);
                sb5.append(i10);
                sb5.append(":");
                sb5.append(i11);
                printWriter2.println(sb5.toString());
            }
            Arrays.fill(nvk.f36611L, 0);
            printWriter2.println("Windows in z order: ");
            int size = nvk.f36617R.size();
            for (int i12 = 0; i12 < size; i12++) {
                List<oos> list = (List) nvk.f36617R.valueAt(i12);
                int keyAt = nvk.f36617R.keyAt(i12);
                StringBuilder sb6 = new StringBuilder(17);
                sb6.append("layer ");
                sb6.append(keyAt);
                printWriter2.println(sb6.toString());
                if (list != null) {
                    for (oos oos : list) {
                        oos.mo22427a(printWriter2);
                    }
                }
            }
            if (cctl.m131524b()) {
                printWriter2.println("Windows in z layer order: ");
                for (int i13 = 8; i13 > 0; i13--) {
                    List<oos> list2 = (List) nvk.f36619T.get(i13);
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(i13);
                    switch (i13) {
                        case 1:
                            str = "CONTENT_WINDOW_ORDER";
                            break;
                        case 2:
                            str = "RAIL_WINDOW_ORDER";
                            break;
                        case 3:
                            str = "FULLSCREEN_WINDOW_ORDER";
                            break;
                        case 4:
                            str = "SYSTEM_UI_WINDOW_ORDER";
                            break;
                        case 5:
                            str = "IME_WINDOW_ORDER";
                            break;
                        case 6:
                            str = "ASSISTANT_WINDOW_ORDER";
                            break;
                        case 7:
                            str = "NOTIFICATIONS_WINDOW_ORDER";
                            break;
                        default:
                            str = "Unknown";
                            break;
                    }
                    objArr[1] = str;
                    printWriter2.printf("layer %d: %s\n", objArr);
                    if (list2 != null) {
                        for (oos oos2 : list2) {
                            if (oos2 != null) {
                                oos2.mo22427a(printWriter2);
                            }
                        }
                    }
                }
            }
            StringBuilder sb7 = new StringBuilder("Focusable windows:");
            synchronized (nvk.f36618S) {
                for (C1240of ofVar : ((nvk) oqa).f36620U) {
                    sb7.append(" (");
                    sb7.append(((oos) ofVar.f26799b).mo22432b());
                    sb7.append(", ");
                    sb7.append(ofVar.f26798a);
                    sb7.append(")");
                }
            }
            printWriter2.println(sb7.toString());
            printWriter2.print("Current focus: ");
            printWriter2.print(nvk.f36615P);
            printWriter2.print(" ");
            printWriter2.println(nvk.f36616Q.mo21642a());
            StringBuilder sb8 = new StringBuilder("Focus history:");
            nvi nvi = nvk.f36616Q.f36598a;
            int size2 = nvi.size();
            for (int i14 = 0; i14 < size2; i14++) {
                sb8.append(" ");
                sb8.append(((oos) nvi.get(i14)).mo22432b());
            }
            printWriter2.println(sb8.toString());
            opx opx = nvk.f36667m;
            if (opx != null) {
                printWriter2.println("Encoder kicker");
                long j = opx.f38219b;
                long j2 = opx.f38221d;
                long j3 = opx.f38220c;
                StringBuilder sb9 = new StringBuilder(97);
                sb9.append("changeThreshold:");
                sb9.append(j);
                sb9.append(" idleLong:");
                sb9.append(j2);
                sb9.append(" idleShort:");
                sb9.append(j3);
                printWriter2.println(sb9.toString());
            }
            if (nvk.f36658d.f36296c.getBoolean("car_dump_screenshot", false)) {
                nvk.mo21667a(false);
            }
        }
        nlv nlv = this.f36143d;
        if (nlv != null) {
            printWriter2.println("\nInputService");
            String valueOf = String.valueOf(Arrays.toString(nlv.f35977a));
            printWriter2.println(valueOf.length() == 0 ? new String("Supported keys: ") : "Supported keys: ".concat(valueOf));
            bire bire = nlv.f35978b;
            if (bire != null) {
                Object[] objArr2 = new Object[13];
                Integer num5 = null;
                if ((bire.f121391a & 1) != 0) {
                    num = Integer.valueOf(bire.f121392b);
                } else {
                    num = null;
                }
                objArr2[0] = num;
                bire bire2 = nlv.f35978b;
                if ((bire2.f121391a & 2) != 0) {
                    num2 = Integer.valueOf(bire2.f121393c);
                } else {
                    num2 = null;
                }
                objArr2[1] = num2;
                bire bire3 = nlv.f35978b;
                if ((bire3.f121391a & 8) != 0) {
                    num3 = Integer.valueOf(bire3.f121395e);
                } else {
                    num3 = null;
                }
                objArr2[2] = num3;
                bire bire4 = nlv.f35978b;
                if ((bire4.f121391a & 16) != 0) {
                    num4 = Integer.valueOf(bire4.f121396f);
                } else {
                    num4 = null;
                }
                objArr2[3] = num4;
                objArr2[4] = Boolean.valueOf(nlv.mo21078b());
                objArr2[5] = Boolean.valueOf(nlv.mo21079d());
                objArr2[6] = Integer.valueOf(nlv.mo21080e());
                objArr2[7] = Integer.valueOf(nlv.mo21081f());
                objArr2[8] = Float.valueOf(nlv.mo21083h());
                bire bire5 = nlv.f35978b;
                if ((bire5.f121391a & 4) != 0) {
                    bool = Boolean.valueOf(bire5.f121394d);
                } else {
                    bool = null;
                }
                objArr2[9] = bool;
                bire bire6 = nlv.f35978b;
                if ((bire6.f121391a & 32) != 0) {
                    bool2 = Boolean.valueOf(bire6.f121397g);
                } else {
                    bool2 = null;
                }
                objArr2[10] = bool2;
                bire bire7 = nlv.f35978b;
                if ((bire7.f121391a & 64) != 0) {
                    bool3 = Boolean.valueOf(bire7.f121398h);
                } else {
                    bool3 = null;
                }
                objArr2[11] = bool3;
                bire bire8 = nlv.f35978b;
                if ((bire8.f121391a & 128) != 0) {
                    num5 = Integer.valueOf(bire8.f121399i);
                }
                objArr2[12] = num5;
                printWriter2.printf("Touchpad: width x height:%dx%d, physicalWidth x physicalHeight:%dx%d\n\tgetTouchPadForUiNavigation():%b, getTouchpadUiAbsolute():%b\n\tgetTouchpadMoveThresholdPx():%d, getTouchpadMultimoveThresholdPx():%d, getTouchpadThresholdMultiplier():%.4f\n\tuiNavigation:%b, uiAbsolute:%b, tapAsSelect:%b, sensitivity:%d\n", objArr2);
            }
            String valueOf2 = String.valueOf(nlv.f35979c);
            StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf2).length() + 17);
            sb10.append("Feedback events: ");
            sb10.append(valueOf2);
            printWriter2.println(sb10.toString());
        }
    }

    /* renamed from: a */
    public final void mo21228a(String str, bpdo bpdo) {
        this.f36144e.mo21273a(bpdn.COMPOSITION, bpdo, str);
    }

    /* renamed from: a */
    public final void mo21229a(oab oab) {
        noj noj = this.f36144e;
        bnsn bnsn = noj.f36155b;
        synchronized (noj.f36227n) {
            this.f36146g.mo21906a(oab);
            if (this.f36144e.f36230q && ((nvk) this.f36142c).f36668n == null) {
                this.f36142c.mo21658a(oab);
                if (mo21233c()) {
                    this.f36144e.mo21261X();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21067a(oeq oeq) {
        this.f36144e.f36225l.post(new noa(this, oeq));
    }

    /* renamed from: a */
    public final void mo21230a(boolean z) {
        noj noj = this.f36144e;
        bnsn bnsn = noj.f36155b;
        if (noj.mo21257T()) {
            noj noj2 = this.f36144e;
            CarDisplayId carDisplayId = this.f36140a;
            nip g = noj2.mo21194g();
            if (g != null) {
                g.mo20813a(z);
            }
            if (carDisplayId.equals(CarDisplayId.f29492a) && noj2.f36231r == 2 && ccuf.m131597h() >= 0) {
                noj2.f36225l.postDelayed(noj2.f36175T, ccuf.m131597h());
            }
            oeh oeh = this.f36144e.f36159D;
            oqa oqa = this.f36142c;
            if (oqa != null) {
                oeh.f37359i.remove(oqa);
            }
            this.f36142c.mo21684e();
        }
    }

    /* renamed from: a */
    public final boolean mo21231a() {
        noj noj = this.f36144e;
        bnsn bnsn = noj.f36155b;
        return noj.f36176U;
    }
}
