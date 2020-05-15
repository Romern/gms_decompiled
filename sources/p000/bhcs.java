package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: bhcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhcs implements bujf {

    /* renamed from: a */
    private final Map f118306a = new HashMap();

    /* renamed from: b */
    private int f118307b = 0;

    /* renamed from: c */
    private final bujf f118308c;

    static {
        bhcs.class.getSimpleName();
    }

    public bhcs(bujf bujf) {
        this.f118308c = bujf;
    }

    /* renamed from: a */
    public final buje mo62698a(Long l) {
        bujf bujf;
        buje buje = (buje) this.f118306a.get(l);
        if (buje == null && (bujf = this.f118308c) != null) {
            bgdy bgdy = (bgdy) bujf;
            bgdy.f116204e.mo61864a();
            buje = null;
            if ((ceze.m138465j() & 1) != 0) {
                bgea bgea = bgdy.f116205f;
                long longValue = l.longValue();
                buiv buiv = bgea.f116209a;
                bukm a = buiv.f153981a.f154180u.mo72770a();
                a.mo72782a(buiv.f153981a.f154162c.mo62775b());
                a.mo72780a(1);
                bumi bumi = buiv.f153988i;
                bumi.mo72859a(new long[]{longValue});
                buiv.f153988i = bumi;
                Set a2 = buiv.f153981a.mo72819a(buiv.f153988i, a);
                if (!a2.isEmpty()) {
                    buje = ((buje[]) a2.toArray(new buje[a2.size()]))[0];
                }
            }
            String valueOf = String.valueOf(buje);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Frewle ApEntry has value: ");
            sb.append(valueOf);
            sb.toString();
        }
        return buje;
    }

    /* renamed from: a */
    public final void mo63556a() {
        String supplyRttLocations = ceze.f183524a.mo6606a().supplyRttLocations();
        if (supplyRttLocations == null) {
            this.f118306a.clear();
            this.f118307b = 0;
        } else if (supplyRttLocations.hashCode() != this.f118307b) {
            this.f118307b = supplyRttLocations.hashCode();
            if (supplyRttLocations.length() == 0) {
                new String("RTT database initialization, phenotype flag is ");
            } else {
                "RTT database initialization, phenotype flag is ".concat(supplyRttLocations);
            }
            int i = -1;
            String[] split = supplyRttLocations.split(";", -1);
            int length = split.length;
            StringBuilder sb = new StringBuilder(32);
            sb.append("RTT string is length ");
            sb.append(length);
            sb.toString();
            for (String str : split) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() == 0) {
                    new String("RTT ap record is ");
                } else {
                    "RTT ap record is ".concat(valueOf);
                }
            }
            this.f118306a.clear();
            int length2 = split.length;
            int i2 = 0;
            while (i2 < length2) {
                String[] split2 = split[i2].split(",", i);
                if (split2.length == 2) {
                    long a = bupz.m120219a(split2[0]);
                    if (a != -1) {
                        try {
                            long parseLong = Long.parseLong(split2[1]);
                            String str2 = split2[0];
                            String str3 = split2[1];
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 12 + String.valueOf(str3).length());
                            sb2.append("RTT ap is ");
                            sb2.append(str2);
                            sb2.append(", ");
                            sb2.append(str3);
                            sb2.toString();
                            this.f118306a.put(Long.valueOf(a), new buje(a, parseLong, 0.0d, 0.0d, 0.0f, 0.0d, 0, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY));
                        } catch (NullPointerException | NumberFormatException e) {
                        }
                    }
                }
                i2++;
                i = -1;
            }
        }
    }
}
