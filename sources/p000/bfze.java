package p000;

import android.content.Intent;
import android.location.Location;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.location.GeofencingRequest;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: bfze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bfze extends bgaf {

    /* renamed from: b */
    final bfyy f115763b;

    /* renamed from: c */
    final /* synthetic */ bfzt f115764c;

    public bfze(bfzt bfzt, bfyy bfyy) {
        this.f115764c = bfzt;
        this.f115763b = bfyy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bgaf mo62496a(bgez bgez) {
        if (!this.f115764c.f115809n.mo26039a()) {
            return this.f115764c.f115804i;
        }
        bgez bgez2 = bgez.UNAVAILABLE;
        int ordinal = bgez.ordinal();
        if (ordinal == 0) {
            return this.f115764c.f115799d;
        }
        if (ordinal == 1) {
            return this.f115764c.f115800e;
        }
        if (ordinal == 2) {
            return this.f115764c.f115801f;
        }
        if (ordinal == 3) {
            return this.f115764c.f115802g;
        }
        if (ordinal != 4) {
            return null;
        }
        return this.f115764c.f115803h;
    }

    /* renamed from: a */
    public abstract bpms mo62472a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62497a(bfwc bfwc) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfyq.a(java.util.List, boolean):void
     arg types: [bxwc, int]
     candidates:
      bfyq.a(buey, bfyp):void
      bfyq.a(java.util.ArrayList, java.util.ArrayList):void
      bfyq.a(java.util.List, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo62502b(Message message) {
        int i;
        int i2;
        bgag bgag;
        Message message2 = message;
        int i3 = message2.what;
        int i4 = 0;
        boolean z = false;
        if (i3 == 3) {
            if (Log.isLoggable("GeofencerStateMachine", 6)) {
                bfxc.m98133b("GeofencerStateMachine", "SM_STOP_CMD should never be sent for now.");
            }
            return false;
        } else if (i3 == 9) {
            this.f115763b.mo62458a((Intent) message2.obj);
            return true;
        } else if (i3 == 12) {
            this.f115763b.mo62470i();
            return true;
        } else if (i3 == 98) {
            ((bfys) message2.obj).mo62449a((Object) null);
            return true;
        } else if (i3 == 150) {
            bfyq bfyq = this.f115763b.f115753k;
            if (!bfyq.f115726u.isEmpty()) {
                bfyq.mo62426a((buey) bfyq.f115726u.removeFirst());
            }
            return true;
        } else if (i3 == 152) {
            bfyq bfyq2 = this.f115763b.f115753k;
            buez buez = (buez) message2.obj;
            spb spb = bfyq2.f115721p;
            if (spb == null) {
                skb skb = bfyq2.f115720o;
                if (skb != null) {
                    bfyq2.f115718m.mo25678a(skb);
                }
            } else {
                bfyq2.f115719n.mo25932a(spb);
            }
            int i5 = bfyq2.f115723r;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (buez.f153675c.size() != 0) {
                            bxwc bxwc = buez.f153675c;
                            int size = bxwc.size();
                            for (i4++; i4 < size; i4++) {
                                buev buev = (buev) bxwc.get(i4);
                                bufe[] bufeArr = bfyq2.f115709d;
                                int i6 = buev.f153661b;
                                bufe bufe = buev.f153663d;
                                if (bufe == null) {
                                    bufe = bufe.f153679f;
                                }
                                bufeArr[i6] = bufe;
                            }
                        } else {
                            if (buez.f153674b.size() != 0) {
                                bfyq2.mo62433a((List) buez.f153674b, true);
                            }
                            if (!bfyq2.f115727v.isEmpty()) {
                                bfyp bfyp = (bfyp) bfyq2.f115727v.removeFirst();
                                synchronized (bfyq2.f115706a) {
                                    Collection<bfyo> collection = bfyp.f115704b;
                                    if (collection != null) {
                                        for (bfyo bfyo : collection) {
                                            bfyq2.f115707b.remove(bfyq2.f115706a.get(bfyo.f115701a));
                                            bfyq2.f115706a.set(bfyo.f115701a, null);
                                        }
                                    }
                                    Collection<bfyo> collection2 = bfyp.f115703a;
                                    if (collection2 != null) {
                                        for (bfyo bfyo2 : collection2) {
                                            bfyq2.f115706a.set(bfyo2.f115701a, bfyo2.f115702b);
                                            bfyq2.f115707b.put(bfyo2.f115702b, Integer.valueOf(bfyo2.f115701a));
                                        }
                                    }
                                }
                                if (!bfyq2.f115727v.isEmpty()) {
                                    bfyq2.f115715j.mo62553d((int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED);
                                } else if (!bfyq2.f115726u.isEmpty()) {
                                    bfyq2.f115715j.mo62553d((int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED);
                                    if (Log.isLoggable("ChreGeofenceHardware", 6)) {
                                        bfxc.m98133b("ChreGeofenceHardware", "Not expecting responses, but sending queue is not empty.");
                                    }
                                }
                            }
                        }
                        if (bfyq2.f115724s != null) {
                            if (Log.isLoggable("ChreGeofenceHardware", 4)) {
                                bfxc.m98132a("ChreGeofenceHardware", "All Geofences synced from CHRE.");
                            }
                            bfyq2.f115724s.run();
                            bfyq2.f115724s = null;
                        }
                    } else {
                        bfyq2.mo62435b();
                        if (buez.f153675c.size() != 0) {
                            bfyq2.mo62433a((List) buez.f153675c, false);
                        } else if (buez.f153674b.size() != 0) {
                            bfyq2.mo62433a((List) buez.f153674b, false);
                        }
                        bfyq2.f115723r = 3;
                        bfzt bfzt = bfyq2.f115715j;
                        if (bfyq2.f115712g > 0) {
                            z = true;
                        }
                        bfzt.mo62515b(z);
                    }
                } else if (!ceub.m138247b()) {
                    bfyq2.f115723r = 0;
                    bfyq2.f115715j.mo62515b(false);
                } else {
                    bfyq2.f115712g = buez.f153673a;
                    bfyq2.f115723r = 2;
                    buew buew = (buew) buey.f153665e.mo74144da();
                    if (buew.f164950c) {
                        buew.mo74035c();
                        buew.f164950c = false;
                    }
                    buey buey = (buey) buew.f164949b;
                    buey.f153668b = 2;
                    buey.f153667a |= 1;
                    for (int i7 = 0; i7 < bfyq2.f115712g; i7++) {
                        buew.mo72625a(i7);
                    }
                    bfyq2.mo62427a((buey) buew.mo74062i(), bfyq.f115705w);
                }
            } else if (Log.isLoggable("ChreGeofenceHardware", 6)) {
                bfxc.m98133b("ChreGeofenceHardware", "Shouldn't receive any response when engine is uninitialized.");
            }
            return true;
        } else if (i3 == 102) {
            PrintWriter printWriter = (PrintWriter) message2.obj;
            bfyy bfyy = this.f115763b;
            printWriter.print("Registered geofences:\n");
            bfwg bfwg = bfyy.f115748f;
            bfwj bfwj = bfwg.f115499e;
            if (!bfwj.mo25992c().isEmpty() || !bfwj.mo25993d().isEmpty()) {
                if (!bfwj.mo25992c().isEmpty() || !bfwj.mo25993d().isEmpty()) {
                    printWriter.println("Active Geofences:");
                    for (bfwn bfwn : bfwj.mo25992c()) {
                        bfwn.mo62384a(printWriter);
                        printWriter.print("\n");
                    }
                }
                if (!bfwj.mo25993d().isEmpty()) {
                    printWriter.println("Inactive Geofences:");
                    for (bfwn bfwn2 : bfwj.mo25993d()) {
                        bfwn2.mo62384a(printWriter);
                        printWriter.print("\n");
                    }
                }
                printWriter.print("\n");
                bfwj.f115503g.mo62341a(printWriter);
            } else {
                printWriter.print("    <none>");
            }
            if (bfwg.f115496b != null) {
                bfwg.f115496b.mo25063a(printWriter);
            }
            int size2 = bfyy.f115752j.size();
            StringBuilder sb = new StringBuilder(30);
            sb.append("\nUniqueIds in use: ");
            sb.append(size2);
            printWriter.print(sb.toString());
            if (bfyy.f115745c.f115522b != null) {
                printWriter.print("\nLast location:\n    ");
                printWriter.print("Time=");
                printWriter.print(new Date(((Location) bfyy.f115745c.f115522b.second).getTime()));
                printWriter.print("\n    ");
                printWriter.print(bfyy.f115745c.f115522b.second);
            }
            printWriter.print("\n");
            bfyy.f115755m.mo62442a(printWriter);
            printWriter.print("\nLocation update interval=");
            printWriter.print(bfyy.f115747e.f115830f);
            printWriter.print("s");
            printWriter.print("\n");
            bgev bgev = bfyy.f115746d;
            synchronized (bgev.f116306h) {
                printWriter.print("Dump of ActivityDetector:\n    Interval=");
                printWriter.print(bgev.f116308j);
                printWriter.print("s");
            }
            ((bfze) this.f115764c.mo62550c()).mo62498a(printWriter);
            printWriter.print("\n");
            bfzt bfzt2 = this.f115764c;
            printWriter.println(String.valueOf(bfzt2.f115900F).concat(":"));
            bgal bgal = bfzt2.f115905K;
            if (bgal != null) {
                i = bgal.f115883c.mo62534b();
            } else {
                i = 0;
            }
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append(" total records=");
            sb2.append(i);
            printWriter.println(sb2.toString());
            int i8 = 0;
            while (true) {
                bgal bgal2 = bfzt2.f115905K;
                if (bgal2 != null) {
                    i2 = bgal2.f115883c.mo62531a();
                } else {
                    i2 = 0;
                }
                if (i8 >= i2) {
                    break;
                }
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i8);
                bgal bgal3 = bfzt2.f115905K;
                if (bgal3 != null) {
                    bgag = bgal3.f115883c.mo62532a(i8);
                } else {
                    bgag = null;
                }
                objArr[1] = bgag.toString();
                printWriter.printf(" rec[%d]: %s\n", objArr);
                printWriter.flush();
                i8++;
            }
            String valueOf = String.valueOf(bfzt2.mo62550c().mo62478g());
            printWriter.println(valueOf.length() == 0 ? new String("curState=") : "curState=".concat(valueOf));
            if (cexh.m138383b()) {
                bfxa.f115569a.mo62418a(printWriter, this.f115763b.mo62461b());
            } else {
                bfxa.f115569a.mo62418a(printWriter, (List) null);
            }
            bfww bfww = this.f115764c.f115812q;
            if (bfww != null) {
                printWriter.println("GeofencerStatsLogManager:");
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = bfww.f115543b;
                StringBuilder sb3 = new StringBuilder(40);
                sb3.append("  Stats elapsed ms: ");
                sb3.append(elapsedRealtime - j);
                printWriter.println(sb3.toString());
                printWriter.println("  GeofencerDeviceCapabilities:");
                bfww.m98099a(printWriter, "gps", ((bpmn) bfww.f115552k.f164949b).f138306b, ((bpmn) bfww.f115553l.f164949b).f138306b);
                bfww.m98099a(printWriter, "nlp", ((bpmn) bfww.f115552k.f164949b).f138307c, ((bpmn) bfww.f115553l.f164949b).f138307c);
                bfww.m98099a(printWriter, "significant_motion_detector", ((bpmn) bfww.f115552k.f164949b).f138308d, ((bpmn) bfww.f115553l.f164949b).f138308d);
                bfww.m98099a(printWriter, "gps_hardware_geofencing", ((bpmn) bfww.f115552k.f164949b).f138309e, ((bpmn) bfww.f115553l.f164949b).f138309e);
                bfww.m98099a(printWriter, "chre_geofencing", ((bpmn) bfww.f115552k.f164949b).f138310f, ((bpmn) bfww.f115553l.f164949b).f138310f);
                printWriter.println("  ProfileInfo:");
                boolean z2 = ((bpmw) bfww.f115554m.f164949b).f138365b;
                StringBuilder sb4 = new StringBuilder(24);
                sb4.append("    isPrimaryUser: ");
                sb4.append(z2);
                printWriter.println(sb4.toString());
                boolean z3 = ((bpmw) bfww.f115554m.f164949b).f138366c;
                StringBuilder sb5 = new StringBuilder(25);
                sb5.append("    isOwnerProfile: ");
                sb5.append(z3);
                printWriter.println(sb5.toString());
                printWriter.println("  Durations:");
                for (Map.Entry entry : bfww.f115551j.entrySet()) {
                    String name = ((bpms) entry.getKey()).name();
                    String valueOf2 = String.valueOf(entry.getValue());
                    StringBuilder sb6 = new StringBuilder(String.valueOf(name).length() + 17 + String.valueOf(valueOf2).length());
                    sb6.append("    ");
                    sb6.append(name);
                    sb6.append(" enabled ms: ");
                    sb6.append(valueOf2);
                    printWriter.println(sb6.toString());
                }
                String name2 = bfww.f115544c.name();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j2 = bfww.f115545d;
                StringBuilder sb7 = new StringBuilder(String.valueOf(name2).length() + 46);
                sb7.append("    current(");
                sb7.append(name2);
                sb7.append(") enabled ms: ");
                sb7.append(elapsedRealtime2 - j2);
                printWriter.println(sb7.toString());
                long j3 = ((bpmp) bfww.f115556o.f164949b).f138320c;
                StringBuilder sb8 = new StringBuilder(64);
                sb8.append("    Significant motion detector enabled ms: ");
                sb8.append(j3);
                printWriter.println(sb8.toString());
                if (!bfww.f115546e) {
                    printWriter.println("      Currently disabled");
                } else {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    long j4 = bfww.f115547f;
                    StringBuilder sb9 = new StringBuilder(45);
                    sb9.append("      Currently enabled: ");
                    sb9.append(elapsedRealtime3 - j4);
                    printWriter.println(sb9.toString());
                }
                printWriter.println("  Counters:");
                int i9 = ((bpmm) bfww.f115555n.f164949b).f138297b;
                int i10 = 33;
                StringBuilder sb10 = new StringBuilder(33);
                sb10.append("    locationRequests: ");
                sb10.append(i9);
                printWriter.println(sb10.toString());
                int i11 = ((bpmm) bfww.f115555n.f164949b).f138298c;
                StringBuilder sb11 = new StringBuilder(33);
                sb11.append("    locationReceived: ");
                sb11.append(i11);
                printWriter.println(sb11.toString());
                int i12 = ((bpmm) bfww.f115555n.f164949b).f138299d;
                StringBuilder sb12 = new StringBuilder(44);
                sb12.append("    sentinelFenceUpdatesNonChre: ");
                sb12.append(i12);
                printWriter.println(sb12.toString());
                int i13 = ((bpmm) bfww.f115555n.f164949b).f138300e;
                StringBuilder sb13 = new StringBuilder(41);
                sb13.append("    sentinelFenceUpdatesChre: ");
                sb13.append(i13);
                printWriter.println(sb13.toString());
                int i14 = ((bpmm) bfww.f115555n.f164949b).f138301f;
                StringBuilder sb14 = new StringBuilder(37);
                sb14.append("    geofenceCountMaximum: ");
                sb14.append(i14);
                printWriter.println(sb14.toString());
                for (Map.Entry entry2 : bfww.f115550i.entrySet()) {
                    String str = (String) entry2.getKey();
                    StringBuilder sb15 = new StringBuilder(String.valueOf(str).length() + 5);
                    sb15.append("    ");
                    sb15.append(str);
                    sb15.append(":");
                    printWriter.println(sb15.toString());
                    bfwu bfwu = (bfwu) entry2.getValue();
                    bxvd bxvd = bfwu.f115541b;
                    int i15 = ((bpml) bxvd.f164949b).f138287c;
                    StringBuilder sb16 = new StringBuilder(38);
                    sb16.append("      addGeofenceRequests: ");
                    sb16.append(i15);
                    printWriter.println(sb16.toString());
                    int i16 = ((bpml) bxvd.f164949b).f138288d;
                    StringBuilder sb17 = new StringBuilder(41);
                    sb17.append("      removeGeofenceRequests: ");
                    sb17.append(i16);
                    printWriter.println(sb17.toString());
                    int i17 = ((bpml) bxvd.f164949b).f138289e;
                    StringBuilder sb18 = new StringBuilder(i10);
                    sb18.append("      geofenceEnters: ");
                    sb18.append(i17);
                    printWriter.println(sb18.toString());
                    int i18 = ((bpml) bxvd.f164949b).f138290f;
                    StringBuilder sb19 = new StringBuilder(32);
                    sb19.append("      geofenceExits: ");
                    sb19.append(i18);
                    printWriter.println(sb19.toString());
                    int i19 = ((bpml) bxvd.f164949b).f138291g;
                    StringBuilder sb20 = new StringBuilder(i10);
                    sb20.append("      geofenceDwells: ");
                    sb20.append(i19);
                    printWriter.println(sb20.toString());
                    int i20 = ((bpml) bxvd.f164949b).f138293i;
                    StringBuilder sb21 = new StringBuilder(39);
                    sb21.append("      geofenceCountMaximum: ");
                    sb21.append(i20);
                    printWriter.println(sb21.toString());
                    for (Map.Entry entry3 : bfwu.f115540a.entrySet()) {
                        C1240of ofVar = (C1240of) entry3.getKey();
                        String valueOf3 = String.valueOf(ofVar.f26798a);
                        String valueOf4 = String.valueOf(ofVar.f26799b);
                        String valueOf5 = String.valueOf(entry3.getValue());
                        StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf3).length() + 29 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
                        sb22.append("      transition/initial(");
                        sb22.append(valueOf3);
                        sb22.append("/");
                        sb22.append(valueOf4);
                        sb22.append("): ");
                        sb22.append(valueOf5);
                        printWriter.println(sb22.toString());
                    }
                    i10 = 33;
                }
                int i21 = bfww.f115548g;
                StringBuilder sb23 = new StringBuilder(30);
                sb23.append("  Events happened: ");
                sb23.append(i21);
                printWriter.println(sb23.toString());
                int i22 = bfww.f115549h;
                StringBuilder sb24 = new StringBuilder(29);
                sb24.append("  Events sampled: ");
                sb24.append(i22);
                printWriter.println(sb24.toString());
            }
            return true;
        } else if (i3 != 103) {
            boolean z4 = bfxc.f115575a;
            return false;
        } else {
            this.f115763b.f115753k.mo62428a(new bfzd(this, (bfys) message2.obj));
            return true;
        }
    }

    /* renamed from: k */
    public void mo62503k() {
        bfww bfww = this.f115764c.f115812q;
        if (bfww != null) {
            bpms a = mo62472a();
            bfww.mo62397a();
            if (!a.equals(bfww.f115544c)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                bfww.mo62400a(bfww.f115544c, elapsedRealtime);
                bfww.f115545d = elapsedRealtime;
                bfww.f115544c = a;
            }
        }
    }

    /* renamed from: l */
    public void mo62504l() {
    }

    /* renamed from: a */
    public void mo62498a(PrintWriter printWriter) {
        printWriter.print("\nDump of current state:");
        printWriter.print("\n    ");
        printWriter.print(mo62478g());
    }

    /* renamed from: a */
    public boolean mo62499a(bgae bgae) {
        boolean z = bfxc.f115575a;
        Pair a = this.f115763b.mo62453a(bgae);
        int intValue = ((Integer) a.first).intValue();
        bgae.mo62449a(Integer.valueOf(intValue));
        if (a.second != null) {
            bfww bfww = this.f115764c.f115812q;
            if (bfww != null) {
                bfww.mo62401a(bgae.f115864b, bgae.f115863a, ((List) a.second).size());
                bfww bfww2 = this.f115764c.f115812q;
                String str = bgae.f115864b;
                bfww2.mo62397a();
                bxvd bxvd = bfww2.mo62395a(str).f115541b;
                int i = ((bpml) bxvd.f164949b).f138288d + 1;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpml bpml = (bpml) bxvd.f164949b;
                bpml bpml2 = bpml.f138283j;
                bpml.f138285a |= 4;
                bpml.f138288d = i;
            }
            mo62501a(bgae.f115864b, (List) a.second);
        }
        return intValue == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo62500a(String str, GeofencingRequest geofencingRequest, List list) {
        if (this.f115764c.f115812q != null) {
            Pair pair = this.f115763b.f115745c.f115522b;
            if (pair == null || pair.second == null) {
                this.f115764c.f115812q.mo62403a(str, geofencingRequest, list, (Location) null);
            } else {
                this.f115764c.f115812q.mo62403a(str, geofencingRequest, list, (Location) pair.second);
            }
            this.f115764c.f115812q.mo62402a(str, geofencingRequest, this.f115763b.mo62452a(str, geofencingRequest.f79343c), this.f115763b.mo62465d());
        }
        if (!cexh.m138383b()) {
            bfxa.f115569a.mo62416a(new bfwx(-2136481340, str, list, "Geofences added", true));
        } else {
            bfxa.f115569a.mo62413a(-64817135, list, 3, true);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo62501a(String str, List list) {
        if (!cexh.m138383b()) {
            bfxa.f115569a.mo62416a(new bfwx(1533697028, str, list, "Geofences removed", true));
        } else if (str != null) {
            bfxa.f115569a.mo62413a(1279658741, list, 4, true);
        } else {
            bfxa.f115569a.mo62413a(1279658741, list, 5, true);
        }
        return true;
    }
}
