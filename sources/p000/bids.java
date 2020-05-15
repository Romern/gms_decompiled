package p000;

import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: bids */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bids implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PrintWriter f120318a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f120319b;

    /* renamed from: c */
    final /* synthetic */ bidv f120320c;

    public bids(bidv bidv, PrintWriter printWriter, CountDownLatch countDownLatch) {
        this.f120320c = bidv;
        this.f120318a = printWriter;
        this.f120319b = countDownLatch;
    }

    public final void run() {
        String str;
        bhri bhri = this.f120320c.f120331f;
        PrintWriter printWriter = this.f120318a;
        bhrc bhrc = bhri.f119382h;
        char c = 3;
        char c2 = 2;
        if (bhrc.f119368b) {
            bhrc.f119367a.mo25063a(printWriter);
            bhpw bhpw = bhri.f119380b;
            bicz bicz = bhpw.f119280b;
            bicz.f120269b.mo64535a(printWriter);
            printWriter.println("\nActive SemanticLocationState:");
            for (bjdg bjdg : bicz.f120272e) {
                printWriter.print("  ");
                printWriter.println(bjdg);
            }
            bhty bhty = ((bhsi) bicz.f120271d).f119455j;
            printWriter.println("\nPlace Inference State Information:");
            int i = bhty.f119586a;
            StringBuilder sb = new StringBuilder(38);
            sb.append(" counterNoInferenceNoRpc : ");
            sb.append(i);
            printWriter.println(sb.toString());
            int i2 = bhty.f119587b;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append(" counterNoInferenceWithRpc : ");
            sb2.append(i2);
            printWriter.println(sb2.toString());
            int i3 = bhty.f119588c;
            StringBuilder sb3 = new StringBuilder(46);
            sb3.append(" counterSuccessfulInferenceNoRpc : ");
            sb3.append(i3);
            printWriter.println(sb3.toString());
            int i4 = bhty.f119589d;
            StringBuilder sb4 = new StringBuilder(48);
            sb4.append(" counterSuccessfulInferenceWithRpc : ");
            sb4.append(i4);
            printWriter.println(sb4.toString());
            int i5 = bhty.f119590e;
            StringBuilder sb5 = new StringBuilder(36);
            sb5.append(" counterPrefetchingRpc : ");
            sb5.append(i5);
            printWriter.println(sb5.toString());
            int i6 = bhty.f119591f;
            StringBuilder sb6 = new StringBuilder(48);
            sb6.append(" counterRpcRequiredButRecentlyMade : ");
            sb6.append(i6);
            printWriter.println(sb6.toString());
            int i7 = bhty.f119592g;
            StringBuilder sb7 = new StringBuilder(47);
            sb7.append(" counterRpcRequiredButUserOnTheGo : ");
            sb7.append(i7);
            printWriter.println(sb7.toString());
            int i8 = bhty.f119593h;
            StringBuilder sb8 = new StringBuilder(51);
            sb8.append(" counterRpcRequiredButGpsSpeedTooHigh : ");
            sb8.append(i8);
            printWriter.println(sb8.toString());
            int i9 = bhty.f119594i;
            StringBuilder sb9 = new StringBuilder(31);
            sb9.append(" clearIndexBadTTL : ");
            sb9.append(i9);
            printWriter.println(sb9.toString());
            int i10 = bhty.f119595j;
            StringBuilder sb10 = new StringBuilder(36);
            sb10.append(" clearIndexExceededTTL : ");
            sb10.append(i10);
            printWriter.println(sb10.toString());
            int i11 = bhty.f119596k;
            StringBuilder sb11 = new StringBuilder(26);
            sb11.append(" freeSpaceL1 : ");
            sb11.append(i11);
            printWriter.println(sb11.toString());
            int i12 = bhty.f119598m;
            StringBuilder sb12 = new StringBuilder(26);
            sb12.append(" freeSpaceL2 : ");
            sb12.append(i12);
            printWriter.println(sb12.toString());
            int i13 = bhty.f119597l;
            StringBuilder sb13 = new StringBuilder(43);
            sb13.append(" loadedPlaceIndexSuccessfully : ");
            sb13.append(i13);
            printWriter.println(sb13.toString());
            printWriter.println();
            for (String str2 : bhty.f119599n) {
                String valueOf = String.valueOf(str2);
                printWriter.println(valueOf.length() == 0 ? new String(" ") : " ".concat(valueOf));
            }
            printWriter.println();
            int i14 = bhty.f119600o;
            StringBuilder sb14 = new StringBuilder(36);
            sb14.append(" totalDataDownloadBytes: ");
            sb14.append(i14);
            printWriter.println(sb14.toString());
            printWriter.println();
            bhuc bhuc = ((bhsi) bicz.f120271d).f119456k.f119770a;
            printWriter.println("\nSegmenterStateInformation:");
            Iterator it = bhuc.f119612a.iterator();
            int i15 = 0;
            while (it.hasNext()) {
                String str3 = (String) it.next();
                StringBuilder sb15 = new StringBuilder(String.valueOf(str3).length() + 29);
                sb15.append("  Invocation  ");
                sb15.append(i15);
                sb15.append(": [");
                sb15.append(str3);
                sb15.append("]");
                printWriter.println(sb15.toString());
                i15++;
            }
            bhxl bhxl = bhpw.f119279a;
            printWriter.println("\nActive NearbyAlertSubscriptions:");
            for (bhxn bhxn : bhxl.f119826e.keySet()) {
                printWriter.print("  ");
                printWriter.println(bhxn);
                printWriter.print("      NearbyPlaceState count = ");
                printWriter.println(((List) bhxl.f119826e.get(bhxn)).size());
                printWriter.println("      NearbyPlaceStates: (place ID, radius type, chain name, isBeaconRequired -> current state, current state timestamp | deterministic state, deterministic state timestamp)");
                for (bhye bhye : (List) bhxl.f119826e.get(bhxn)) {
                    Object[] objArr = new Object[8];
                    objArr[0] = bhye.f119880a.f119985a;
                    objArr[1] = Integer.valueOf(bhxn.f119830b.f109596e);
                    UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = bhxn.f119830b.f109594c;
                    objArr[c2] = userLocationNearbyAlertFilter.f109590c;
                    objArr[c] = Boolean.valueOf(userLocationNearbyAlertFilter.f109591d);
                    objArr[4] = Integer.valueOf(bhye.f119881b);
                    objArr[5] = Long.valueOf(bhye.f119883d);
                    objArr[6] = Integer.valueOf(bhye.f119882c);
                    objArr[7] = Long.valueOf(bhye.f119884e);
                    printWriter.printf("      %s, %d, %s, %b -> %d, %d | %d, %d\n", objArr);
                    c = 3;
                    c2 = 2;
                }
                c = 3;
                c2 = 2;
            }
            biaf biaf = bhxl.f119822a;
            printWriter.println(String.format(Locale.US, "\nCurrent highest power priority: %d", Integer.valueOf(biaf.f120034c)));
            printWriter.println(String.format(Locale.US, "\nNearby Alert Refresh Bounds: %s", biaf.f120036e));
            bhzt bhzt = biaf.f120035d;
            if (bhzt != null) {
                String valueOf2 = String.valueOf(bhzt);
                StringBuilder sb16 = new StringBuilder(String.valueOf(valueOf2).length() + 22);
                sb16.append("\n  My RefreshGeofence:");
                sb16.append(valueOf2);
                printWriter.println(sb16.toString());
            }
            bhxk bhxk = bhxl.f119824c;
            printWriter.println("\nActive NearbyAlertModules:");
            for (int i16 = 0; i16 < bhxk.f119819d.f26809h; i16++) {
                Iterator it2 = bhxk.f119820e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((String) it2.next()).equals(bhxk.f119819d.mo15620b(i16))) {
                            printWriter.println(String.format("\n  ZeroPowerModule: %s", bhxk.f119819d.mo15620b(i16)));
                            ((bhzr) bhxk.f119819d.mo15621c(i16)).mo64460a(printWriter);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                Iterator it3 = bhxk.f119821f.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (((String) it3.next()).equals(bhxk.f119819d.mo15620b(i16))) {
                            printWriter.println(String.format("\n  HighPowerModule: %s", bhxk.f119819d.mo15620b(i16)));
                            ((bhzr) bhxk.f119819d.mo15621c(i16)).mo64460a(printWriter);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            bicm bicm = bhpw.f119281c;
            printWriter.println("\nActive PlacefencingStates:");
            for (bico bico : bicm.f120221a.keySet()) {
                printWriter.print("  ");
                printWriter.println(bico);
            }
        } else {
            printWriter.println("SubscriptionManager not yet initialized from cache");
        }
        bigx bigx = this.f120320c.f120333h;
        PrintWriter printWriter2 = this.f120318a;
        printWriter2.println("SignalManager");
        int i17 = bigx.f120565o;
        StringBuilder sb17 = new StringBuilder(26);
        sb17.append("  FLP WakeUps: ");
        sb17.append(i17);
        printWriter2.println(sb17.toString());
        int i18 = bigx.f120566p;
        StringBuilder sb18 = new StringBuilder(25);
        sb18.append("  Wifi Scans: ");
        sb18.append(i18);
        printWriter2.println(sb18.toString());
        int i19 = bigx.f120567q;
        StringBuilder sb19 = new StringBuilder(24);
        sb19.append("  Ble Scans: ");
        sb19.append(i19);
        printWriter2.println(sb19.toString());
        int i20 = bigx.f120568r;
        StringBuilder sb20 = new StringBuilder(30);
        sb20.append("  Geofence Events: ");
        sb20.append(i20);
        printWriter2.println(sb20.toString());
        printWriter2.println();
        printWriter2.println("  Clients:");
        int[] iArr = bigx.f120549a;
        for (int i21 : iArr) {
            if (i21 == 0) {
                str = "NO_POWER";
            } else if (i21 == 1) {
                str = "LOW_POWER";
            } else if (i21 == 2) {
                str = "BALANCED_POWER";
            } else if (i21 != 3) {
                StringBuilder sb21 = new StringBuilder(21);
                sb21.append("UNKNOWN (");
                sb21.append(i21);
                sb21.append(")");
                str = sb21.toString();
            } else {
                str = "HIGH_POWER";
            }
            printWriter2.println(String.valueOf(str).concat(" Clients:"));
            List list = bigx.f120564n;
            int size = list.size();
            int i22 = 0;
            for (int i23 = 0; i23 < size; i23++) {
                bigw bigw = (bigw) list.get(i23);
                if (i21 == bigw.f120546a) {
                    i22++;
                    String valueOf3 = String.valueOf(bigw.f120548c.toString());
                    printWriter2.println(valueOf3.length() == 0 ? new String("    ") : "    ".concat(valueOf3));
                }
            }
            if (i22 == 0) {
                printWriter2.println("    None");
            }
        }
        bidv bidv = this.f120320c;
        PrintWriter printWriter3 = this.f120318a;
        printWriter3.println("\nPhenotype information");
        try {
            String valueOf4 = String.valueOf((ExperimentTokens) aucu.m76783a(anef.m64089a(bidv.f120326a).mo41765o("com.google.android.gms.places"), 3, TimeUnit.SECONDS));
            StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf4).length() + 17);
            sb22.append("\nExperiment IDs: ");
            sb22.append(valueOf4);
            printWriter3.println(sb22.toString());
        } catch (Exception e) {
            String valueOf5 = String.valueOf(e);
            StringBuilder sb23 = new StringBuilder(String.valueOf(valueOf5).length() + 34);
            sb23.append("\nException getting experiment IDs:");
            sb23.append(valueOf5);
            printWriter3.println(sb23.toString());
        }
        printWriter3.println("\nPlaces flags:");
        Field[] declaredFields = bhpu.class.getDeclaredFields();
        for (Field field : declaredFields) {
            int modifiers = field.getModifiers();
            if (Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers)) {
                try {
                    Object obj = field.get(bhpu.class);
                    if (obj instanceof bdyx) {
                        bdyx bdyx = (bdyx) obj;
                        String b = bdyx.mo58453b();
                        String valueOf6 = String.valueOf(bdyx.mo58455c());
                        StringBuilder sb24 = new StringBuilder(String.valueOf(b).length() + 2 + String.valueOf(valueOf6).length());
                        sb24.append(b);
                        sb24.append(": ");
                        sb24.append(valueOf6);
                        printWriter3.println(sb24.toString());
                    }
                } catch (Exception e2) {
                }
            }
        }
        this.f120319b.countDown();
    }
}
