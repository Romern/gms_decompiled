package p000;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: smj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class smj implements Comparable {

    /* renamed from: a */
    protected static final int[] f44758a = {-1, 0, 1, 2, 3, 7};

    /* renamed from: f */
    private static final bnic f44759f = bnic.m109494a(-1, 3, 2, 1, 0, 7, new Integer[0]);

    /* renamed from: b */
    protected final C1245ok f44760b = new C1245ok();

    /* renamed from: c */
    protected final int f44761c;

    /* renamed from: d */
    protected final int f44762d;

    /* renamed from: e */
    protected final int f44763e;

    public smj(int i, int i2, int i3) {
        this.f44761c = i;
        this.f44762d = i2;
        this.f44763e = i3;
        int[] iArr = f44758a;
        for (int i4 : iArr) {
            this.f44760b.put(Integer.valueOf(i4), new smi(i, i2, i4, i3));
        }
    }

    /* renamed from: a */
    public void mo25746a(smi smi) {
        if (mo25748b(smi)) {
            mo25747b(-1).mo25738a(smi);
            mo25747b(smi.f44750n).mo25738a(smi);
        }
    }

    /* renamed from: b */
    public smi mo25747b(int i) {
        bnic bnic = f44759f;
        Integer valueOf = Integer.valueOf(i);
        if (bnic.contains(valueOf)) {
            smi smi = (smi) this.f44760b.get(valueOf);
            sdo.m34959a(smi);
            return smi;
        }
        StringBuilder sb = new StringBuilder(42);
        sb.append("unexpected device state passed ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public boolean mo25748b(smi smi) {
        int i = smi.f44750n;
        return this.f44761c == smi.f44748l && this.f44762d == smi.f44749m && this.f44763e == smi.f44751o && i >= 0 && (i <= 3 || i == 7);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (mo25747b(-1).mo25754e() > ((smj) obj).mo25747b(-1).mo25754e() ? 1 : (mo25747b(-1).mo25754e() == ((smj) obj).mo25747b(-1).mo25754e() ? 0 : -1));
    }

    public String toString() {
        smi b = mo25747b(-1);
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        long e = b.mo25754e();
        if (e > 0) {
            long e2 = mo25747b(0).mo25754e();
            long e3 = mo25747b(1).mo25754e();
            long e4 = mo25747b(2).mo25754e();
            long e5 = mo25747b(3).mo25754e();
            long e6 = mo25747b(7).mo25754e();
            NumberFormat percentInstance = NumberFormat.getPercentInstance();
            double d = (double) e;
            double d2 = (double) e2;
            Double.isNaN(d2);
            Double.isNaN(d);
            double d3 = (double) e3;
            Double.isNaN(d3);
            Double.isNaN(d);
            double d4 = (double) e4;
            Double.isNaN(d4);
            Double.isNaN(d);
            double d5 = (double) e5;
            Double.isNaN(d5);
            Double.isNaN(d);
            double d6 = (double) e6;
            Double.isNaN(d6);
            Double.isNaN(d);
            sb.append(String.format(" %% ni discharging: %s %% ni charging: %s %% i discharging: %s %% i charging: %s %% not reported: %s\n", percentInstance.format(d2 / d), percentInstance.format(d3 / d), percentInstance.format(d4 / d), percentInstance.format(d5 / d), percentInstance.format(d6 / d)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ");
        Date date = new Date();
        date.setTime(b.f44752p);
        String format = simpleDateFormat.format(date);
        date.setTime(b.f44753q);
        sb.append(String.format("First record date: %s Last record date: %s UID: %s\n", format, simpleDateFormat.format(date), Integer.valueOf(this.f44762d)));
        return sb.toString();
    }
}
