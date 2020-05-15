package p000;

import java.io.EOFException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: agau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agau {

    /* renamed from: a */
    private static final agcm f65102a = new agcm("MdnsResponseDecoder");

    /* renamed from: b */
    private final String[] f65103b;

    /* renamed from: c */
    private final sqv f65104c;

    public agau(sqv sqv, String[] strArr) {
        this.f65104c = sqv;
        this.f65103b = strArr;
    }

    /* renamed from: a */
    private static agat m53845a(List list, String[] strArr) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            agat agat = (agat) it.next();
            Iterator it2 = agat.mo35156a().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (Arrays.equals(((agar) it2.next()).f65091a, strArr)) {
                        return agat;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m53846a(agap agap) {
        agap.mo35144a(6);
        agap.mo35144a(agap.mo35147c());
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    public final int mo35173a(DatagramPacket datagramPacket, List list) {
        List list2 = list;
        agap agap = new agap(datagramPacket);
        int i = 12;
        try {
            agap.mo35147c();
            if ((agap.mo35147c() & 63503) != 32768) {
                return 1;
            }
            agap.mo35147c();
            int c = agap.mo35147c();
            int c2 = agap.mo35147c();
            int c3 = agap.mo35147c();
            srn srn = f65102a.f65218b;
            int i2 = 2;
            if (c <= 0) {
                return 2;
            }
            LinkedList<agas> linkedList = new LinkedList();
            int i3 = 0;
            int i4 = 0;
            while (i4 < c + c2 + c3) {
                try {
                    String[] d = agap.mo35148d();
                    int c4 = agap.mo35147c();
                    if (c4 == 1) {
                        try {
                            linkedList.add(new agal(d, 1, agap));
                        } catch (IOException e) {
                            bnsl bnsl = (bnsl) f65102a.f65218b.mo68387b();
                            bnsl.mo68437a(e);
                            bnsl.mo68432a("agau", "a", 86, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("Failed to read A record from mDNS response.");
                            return 4;
                        }
                    } else if (c4 == i) {
                        try {
                            linkedList.add(new agar(d, agap));
                        } catch (IOException e2) {
                            bnsl bnsl2 = (bnsl) f65102a.f65218b.mo68387b();
                            bnsl2.mo68437a(e2);
                            bnsl2.mo68432a("agau", "a", 121, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("Failed to read PTR record from mDNS response.");
                            return 6;
                        }
                    } else if (c4 == 16) {
                        try {
                            linkedList.add(new agbu(d, agap));
                        } catch (IOException e3) {
                            bnsl bnsl3 = (bnsl) f65102a.f65218b.mo68387b();
                            bnsl3.mo68437a(e3);
                            bnsl3.mo68432a("agau", "a", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68405a("Failed to read TXT record from mDNS response.");
                            return 10;
                        }
                    } else if (c4 == 28) {
                        try {
                            agal agal = new agal(d, 28, agap);
                            if (agal.f65077a != null) {
                                linkedList.add(agal);
                            }
                        } catch (IOException e4) {
                            bnsl bnsl4 = (bnsl) f65102a.f65218b.mo68387b();
                            bnsl4.mo68437a(e4);
                            bnsl4.mo68432a("agau", "a", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl4.mo68405a("Failed to read AAAA record from mDNS response.");
                            return 5;
                        }
                    } else if (c4 != 33) {
                        try {
                            m53846a(agap);
                        } catch (IOException e5) {
                            IOException iOException = e5;
                            bnsl bnsl5 = (bnsl) f65102a.f65218b.mo68387b();
                            bnsl5.mo68437a(iOException);
                            bnsl5.mo68432a("agau", "a", 175, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl5.mo68405a("Failed to skip mDNS record.");
                            return 11;
                        }
                    } else if (d.length == 4) {
                        try {
                            linkedList.add(new agbd(d, agap));
                        } catch (IOException e6) {
                            bnsl bnsl6 = (bnsl) f65102a.f65218b.mo68387b();
                            bnsl6.mo68437a(e6);
                            bnsl6.mo68432a("agau", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl6.mo68405a("Failed to read SRV record from mDNS response.");
                            return 8;
                        }
                    } else {
                        try {
                            m53846a(agap);
                        } catch (IOException e7) {
                            IOException iOException2 = e7;
                            bnsl bnsl7 = (bnsl) f65102a.f65218b.mo68387b();
                            bnsl7.mo68437a(iOException2);
                            bnsl7.mo68432a("agau", "a", 148, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl7.mo68405a("Failed to skip SVR record from mDNS response.");
                            return 9;
                        }
                    }
                    i4++;
                    i = 12;
                    i2 = 2;
                    i3 = 0;
                } catch (IOException e8) {
                    bnsl bnsl8 = (bnsl) f65102a.f65218b.mo68387b();
                    bnsl8.mo68437a(e8);
                    bnsl8.mo68432a("agau", "a", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl8.mo68405a("Failed to read labels from mDNS response.");
                    return 3;
                }
            }
            long b = this.f65104c.mo20506b();
            for (agas agas : linkedList) {
                if (agas instanceof agar) {
                    String[] strArr = agas.f65092c;
                    String[] strArr2 = this.f65103b;
                    if (strArr2 == null || Arrays.equals(strArr, strArr2) || (strArr.length == this.f65103b.length + i2 && strArr[1].equals("_sub") && agas.m53826a(this.f65103b, strArr))) {
                        agar agar = (agar) agas;
                        agat a = m53845a(list2, agar.f65091a);
                        if (a == null) {
                            a = new agat(b);
                            list2.add(a);
                        }
                        a.mo35160a(agar);
                    }
                }
            }
            for (agas agas2 : linkedList) {
                if (agas2 instanceof agbd) {
                    agbd agbd = (agbd) agas2;
                    agat a2 = m53845a(list2, agbd.f65092c);
                    if (a2 != null) {
                        a2.mo35158a(agbd);
                    }
                } else if (agas2 instanceof agbu) {
                    agbu agbu = (agbu) agas2;
                    agat a3 = m53845a(list2, agbu.f65092c);
                    if (a3 != null) {
                        a3.mo35159a(agbu);
                    }
                }
            }
            for (agas agas3 : linkedList) {
                if (agas3 instanceof agal) {
                    agal agal2 = (agal) agas3;
                    String[] strArr3 = agal2.f65092c;
                    agat agat = null;
                    if (list2 != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                agat agat2 = (agat) it.next();
                                agbd c5 = agat2.mo35164c();
                                if (c5 != null && Arrays.equals(c5.f65115b, strArr3)) {
                                    agat = agat2;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (agal2.f65078b != null && agat != null) {
                        agat.mo35157a(agal2);
                    } else if (!(agal2.f65077a == null || agat == null)) {
                        agat.mo35163b(agal2);
                    }
                }
            }
            return i3;
        } catch (EOFException e9) {
            bnsl bnsl9 = (bnsl) f65102a.f65218b.mo68387b();
            bnsl9.mo68437a(e9);
            bnsl9.mo68432a("agau", "a", 186, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl9.mo68405a("Reached the end of the mDNS response unexpectedly.");
            return 12;
        }
    }
}
