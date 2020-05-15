package p000;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: ajfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajfo extends buqn {

    /* renamed from: a */
    final /* synthetic */ PrintWriter f70527a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f70528b;

    /* renamed from: c */
    final /* synthetic */ NearbyMessagesChimeraService f70529c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfo(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str, PrintWriter printWriter, CountDownLatch countDownLatch) {
        super(str);
        this.f70529c = nearbyMessagesChimeraService;
        this.f70527a = printWriter;
        this.f70528b = countDownLatch;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, ajgv]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    public final void run() {
        int i;
        char c;
        String str;
        byte[] bArr;
        Iterator it;
        ajbn ajbn;
        String str2;
        String str3;
        String str4;
        int i2;
        ajeq ajeq = (ajeq) this.f70529c.f80809h.mo36473a(ajeq.class);
        PrintWriter printWriter = this.f70527a;
        ajeq.f70461c.mo72984b();
        ajec ajec = new ajec(ajeq.f70459a, null, 9729);
        String str5 = "";
        String valueOf = String.valueOf(ajec.mo38542a(str5));
        printWriter.println(valueOf.length() == 0 ? new String("Server URL: ") : "Server URL: ".concat(valueOf));
        this.f70527a.println();
        aiyr aiyr = (aiyr) this.f70529c.f80809h.mo36473a(aiyr.class);
        PrintWriter printWriter2 = this.f70527a;
        aiyr.f70096g.mo72984b();
        Set o = aiyr.f70093d.mo67316o();
        int size = o.size();
        StringBuilder sb = new StringBuilder(26);
        sb.append(size);
        sb.append(" subscriber(s):");
        printWriter2.println(sb.toString());
        Iterator it2 = o.iterator();
        while (true) {
            i = 1;
            c = 0;
            if (!it2.hasNext()) {
                break;
            }
            ClientAppIdentifier clientAppIdentifier = (ClientAppIdentifier) it2.next();
            Set<aiyo> a = ((bndq) aiyr.f70093d).mo67127c(clientAppIdentifier);
            if (a != null) {
                i2 = a.size();
            } else {
                i2 = 0;
            }
            printWriter2.printf("  [%s] %d subscription(s):\n", clientAppIdentifier, Integer.valueOf(i2));
            printWriter2.print("    ");
            if (a != null) {
                for (aiyo aiyo : a) {
                    printWriter2.println(aiyo);
                }
            }
        }
        this.f70527a.println();
        aiyh aiyh = (aiyh) this.f70529c.f80809h.mo36473a(aiyh.class);
        PrintWriter printWriter3 = this.f70527a;
        aiyh.f70062d.mo72984b();
        int size2 = aiyh.f70061c.size();
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append(size2);
        sb2.append(" publisher(s):");
        printWriter3.println(sb2.toString());
        for (aiye aiye : aiyh.f70061c) {
            printWriter3.print("  ");
            printWriter3.println(aiye);
        }
        this.f70527a.println();
        PrintWriter printWriter4 = this.f70527a;
        aixs aixs = ((ajbd) this.f70529c.f80809h.mo36473a(ajbd.class)).f70306c;
        printWriter4.println("Started mediums:");
        SparseArray sparseArray = aixs.f70015b;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            arrayList.add((ajgo) sparseArray.valueAt(i3));
        }
        String valueOf2 = String.valueOf(arrayList);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 15);
        sb3.append("  Advertising: ");
        sb3.append(valueOf2);
        printWriter4.println(sb3.toString());
        String valueOf3 = String.valueOf(ajgs.m58686a(aixs.m58133a(aixs.f70016c)));
        printWriter4.println(valueOf3.length() == 0 ? new String("  Foreground scanning: ") : "  Foreground scanning: ".concat(valueOf3));
        aixs.f70018e.mo72984b();
        if (aixs.f70021h != null) {
            str = "[ble]";
        } else {
            str = "[]";
        }
        printWriter4.println(str.length() == 0 ? new String("  Background scanning: ") : "  Background scanning: ".concat(str));
        this.f70527a.println();
        aiwj aiwj = this.f70529c.f80811j;
        PrintWriter printWriter5 = this.f70527a;
        printWriter5.println("BackgroundSubscribeCache (SystemMemoryCache)");
        String valueOf4 = String.valueOf(aiwj.f69937a.mo25066b());
        printWriter5.println(valueOf4.length() == 0 ? new String("  id=") : "  id=".concat(valueOf4));
        printWriter5.println("  cacheData=");
        for (Bundle bundle : aiwj.mo38162b()) {
            String valueOf5 = String.valueOf(aiwj.m58077e(bundle));
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf5).length() + 11);
            sb4.append("    client=");
            sb4.append(valueOf5);
            printWriter5.print(sb4.toString());
            long d = aiwj.m58076d(bundle);
            StringBuilder sb5 = new StringBuilder(43);
            sb5.append(", expirationTimeMillis=");
            sb5.append(d);
            printWriter5.print(sb5.toString());
            String valueOf6 = String.valueOf(aiwj.m58074b(bundle));
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 10);
            sb6.append(", request=");
            sb6.append(valueOf6);
            printWriter5.println(sb6.toString());
        }
        this.f70527a.println();
        ajbn ajbn2 = (ajbn) this.f70529c.f80809h.mo36473a(ajbn.class);
        PrintWriter printWriter6 = this.f70527a;
        Iterator it3 = ajbn2.f70330d.mo38454a().iterator();
        while (it3.hasNext()) {
            ClientAppIdentifier clientAppIdentifier2 = (ClientAppIdentifier) it3.next();
            Object[] objArr = new Object[i];
            objArr[c] = clientAppIdentifier2;
            printWriter6.printf("Client %s - ", objArr);
            Collection<byzr> a2 = ajbn2.f70330d.mo38453a(clientAppIdentifier2).mo38457a();
            int size3 = a2.size();
            StringBuilder sb7 = new StringBuilder(38);
            sb7.append(size3);
            sb7.append(" nearby online message(s): ");
            printWriter6.println(sb7.toString());
            for (byzr byzr : a2) {
                byze byze = byzr.f169154c;
                if (byze == null) {
                    byze = byze.f169064e;
                }
                int a3 = byze.f169068c.mo73744a();
                if (a3 > 50) {
                    bArr = Arrays.copyOf(byze.f169068c.getKey(), 50);
                } else {
                    bArr = byze.f169068c.getKey();
                }
                byzh byzh = byze.f169067b;
                if (byzh == null) {
                    byzh = byzh.f169078d;
                }
                String str6 = byzh.f169081b;
                byzh byzh2 = byze.f169067b;
                if (byzh2 == null) {
                    byzh2 = byzh.f169078d;
                }
                String str7 = byzh2.f169082c;
                int a4 = byze.f169068c.mo73744a();
                StringBuilder sb8 = new StringBuilder();
                if (bArr == null) {
                    sb8.append("\"\"");
                    str3 = sb8.toString();
                    str2 = str5;
                    ajbn = ajbn2;
                    it = it3;
                } else {
                    sb8.append('\"');
                    int length = bArr.length;
                    int i4 = 0;
                    while (i4 < length) {
                        String str8 = str5;
                        byte b = bArr[i4] & 255;
                        ajbn ajbn3 = ajbn2;
                        char c2 = (char) b;
                        Iterator it4 = it3;
                        if (b == 92 || b == 34) {
                            sb8.append('\\');
                            sb8.append(c2);
                        } else if (b >= 32 && b < Byte.MAX_VALUE) {
                            sb8.append(c2);
                        } else {
                            sb8.append(String.format("\\%03o", Integer.valueOf(b)));
                        }
                        i4++;
                        str5 = str8;
                        ajbn2 = ajbn3;
                        it3 = it4;
                    }
                    str2 = str5;
                    ajbn = ajbn2;
                    it = it3;
                    sb8.append('\"');
                    str3 = sb8.toString();
                }
                if (a3 <= 50) {
                    str4 = str2;
                } else {
                    str4 = " <truncated>";
                }
                StringBuilder sb9 = new StringBuilder(String.valueOf(str6).length() + 54 + String.valueOf(str7).length() + String.valueOf(str3).length() + str4.length());
                sb9.append("Message{namespace=");
                sb9.append(str6);
                sb9.append(", type=");
                sb9.append(str7);
                sb9.append(", payload=");
                sb9.append(a4);
                sb9.append(" bytes ");
                sb9.append(str3);
                sb9.append(str4);
                sb9.append("}");
                String sb10 = sb9.toString();
                String valueOf7 = String.valueOf(byzr.f169153b);
                String valueOf8 = String.valueOf(byzr.f169156e);
                String a5 = aizs.m58302a(byzr.f169155d);
                StringBuilder sb11 = new StringBuilder(String.valueOf(sb10).length() + 64 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length() + String.valueOf(a5).length());
                sb11.append("SubscribedMessage{message=");
                sb11.append(sb10);
                sb11.append(", subscriptionIds=");
                sb11.append(valueOf7);
                sb11.append(", urls=");
                sb11.append(valueOf8);
                sb11.append(", beaconIds=");
                sb11.append(a5);
                sb11.append("}");
                String valueOf9 = String.valueOf(sb11.toString());
                printWriter6.println(valueOf9.length() == 0 ? new String("  ") : "  ".concat(valueOf9));
                str5 = str2;
                ajbn2 = ajbn;
                it3 = it;
            }
            printWriter6.println();
            i = 1;
            c = 0;
        }
        this.f70527a.println();
        ajai ajai = (ajai) this.f70529c.f80809h.mo36473a(ajai.class);
        PrintWriter printWriter7 = this.f70527a;
        Set<String> keySet = ajai.f70246g.keySet();
        int size4 = keySet.size();
        StringBuilder sb12 = new StringBuilder(26);
        sb12.append(size4);
        sb12.append(" ble device(s):");
        printWriter7.println(sb12.toString());
        for (String str9 : keySet) {
            printWriter7.printf("  [%s] %s\n", str9, (ajag) ajai.f70246g.get(str9));
        }
        this.f70527a.println();
        ajeb ajeb = (ajeb) this.f70529c.f80809h.mo36473a(ajeb.class);
        PrintWriter printWriter8 = this.f70527a;
        ArrayList arrayList2 = new ArrayList();
        bnrd a6 = aixs.f70014a.iterator();
        while (a6.hasNext()) {
            bzbu bzbu = (bzbu) a6.next();
            byzn[] byznArr = (byzn[]) ajeb.f70410a.get(bzbu.f169275k);
            if (byznArr != null) {
                arrayList2.add(String.format("%s %s", Integer.valueOf(byznArr.length), ajgs.m58685a(bzbu)));
            }
        }
        printWriter8.printf("Reserved tokens: %s\n", arrayList2);
        this.f70527a.println();
        ajgu ajgu = (ajgu) this.f70529c.f80809h.mo36473a(ajgu.class);
        PrintWriter printWriter9 = this.f70527a;
        ajgu.f70594c.mo72984b();
        ajgu.mo38618a();
        printWriter9.printf("%s nearby token(s):\n", Integer.valueOf(ajgu.f70592a.size()));
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        for (ajgv ajgv : ajgu.f70592a.values()) {
            int i5 = ajgv.f70603f;
            if (i5 == 1) {
                hashSet3.add(ajgv);
            } else if (i5 == 3) {
                hashSet.add(ajgv);
            } else if (i5 != 4) {
                ((bnsl) ahfq.f67120a.mo68387b()).mo68413a("Unknown network state(%s) for token cache item: %s", ajgv.f70603f, (Object) ajgv);
            } else {
                hashSet2.add(ajgv);
            }
        }
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            printWriter9.printf("  [valid] %s\n", (ajgv) it5.next());
        }
        Iterator it6 = hashSet2.iterator();
        while (it6.hasNext()) {
            printWriter9.printf("  [invalid] %s\n", (ajgv) it6.next());
        }
        Iterator it7 = hashSet3.iterator();
        while (it7.hasNext()) {
            printWriter9.printf("  [unconfirmed] %s\n", (ajgv) it7.next());
        }
        this.f70528b.countDown();
    }
}
