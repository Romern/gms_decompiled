package p000;

import android.os.SystemClock;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Collection;
import java.util.List;

/* renamed from: bhsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhsl implements bhtn {

    /* renamed from: a */
    final /* synthetic */ bhso f119466a;

    /* renamed from: b */
    private final bhtx f119467b;

    /* renamed from: c */
    private final Collection f119468c;

    /* renamed from: d */
    private final bhsv f119469d;

    public bhsl(bhso bhso, bhtx bhtx, Collection collection, bhsv bhsv) {
        this.f119466a = bhso;
        this.f119467b = bhtx;
        this.f119468c = collection;
        this.f119469d = bhsv;
    }

    /* renamed from: a */
    public final void mo64221a(Collection collection, long[] jArr) {
        int i;
        int i2;
        String str;
        if (this.f119466a.f119485j != null) {
            int length = jArr.length;
            if (length > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f119466a.f119482g[0] + bicy.m101983b() >= elapsedRealtime) {
                    this.f119466a.f119483h.f119591f++;
                    i2 = 4;
                } else if (cggm.f186849a.mo6606a().mo83720K()) {
                    bhsv bhsv = this.f119469d;
                    if (bhsv.f119503b) {
                        if (bhsv.f119502a != 4) {
                            i2 = 6;
                        } else {
                            i2 = 5;
                        }
                        this.f119466a.f119483h.f119592g++;
                    } else {
                        i2 = 2;
                    }
                } else if (this.f119467b.f119580a.f119611g >= ((float) cggm.f186849a.mo6606a().mo83725d())) {
                    this.f119466a.f119483h.f119593h++;
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                if (i2 == 2) {
                    bhuj.m101555a();
                    StringBuilder sb = new StringBuilder(51);
                    sb.append("Scheduling a download of missing cells: ");
                    sb.append(length);
                    sb.toString();
                    List a = bhug.m101542a(this.f119467b.f119580a, (int) cggm.f186849a.mo6606a().mo83739r());
                    bhso bhso = this.f119466a;
                    bhso.f119477b.mo64271a(a, new bhsm(bhso));
                    long[] jArr2 = this.f119466a.f119482g;
                    jArr2[0] = jArr2[1];
                    jArr2[1] = elapsedRealtime;
                } else {
                    bhuj.m101555a();
                    int i3 = i2 - 1;
                    if (i3 != 2) {
                        str = i3 != 3 ? i3 != 4 ? "User is in transit." : "On-the-go probability too high." : "Too soon since last downloads.";
                    } else {
                        str = "GPS speed is too high.";
                    }
                    float f = this.f119467b.f119580a.f119611g;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    sb2.append("Not scheduling a download of missing data because: ");
                    sb2.append(str);
                    sb2.append(" Missing cells: ");
                    sb2.append(length);
                    sb2.append(", speed ");
                    sb2.append(f);
                    sb2.append(",transitDecision confidence ");
                    sb2.append(1.0f);
                    sb2.toString();
                }
                i = i2;
            } else {
                bhuj.m101555a();
                i = 1;
            }
            int size = this.f119468c.size();
            float f2 = (((float) length) * 100.0f) / ((float) size);
            float f3 = 100.0f - f2;
            bhuj.m101555a();
            StringBuilder sb3 = new StringBuilder(68);
            sb3.append("Inference data available: percentage of area covered ");
            sb3.append(f3);
            sb3.toString();
            if (f3 > ((float) ((int) cggm.f186849a.mo6606a().mo83728g()))) {
                bhso bhso2 = this.f119466a;
                bhso2.f119477b.mo64272a(collection, new bhsn(bhso2, this.f119467b, this.f119468c, length, i));
                if (i == 2) {
                    this.f119466a.f119483h.f119589d++;
                    return;
                }
                this.f119466a.f119483h.f119588c++;
                return;
            }
            bhsk bhsk = this.f119466a.f119485j;
            if (bhsk != null) {
                int i4 = (int) f2;
                bhtx bhtx = this.f119467b;
                if (bhsk.f119463a != null) {
                    bhwp a2 = bhuj.m101555a();
                    StringBuilder sb4 = new StringBuilder(62);
                    sb4.append("Too few candidate results: percentageOfMissingArea ");
                    sb4.append(i4);
                    a2.mo64358a(sb4.toString());
                    bhsi bhsi = (bhsi) bhsk.f119463a;
                    if (bhsi.f119449d) {
                        bhsi.f119450e.mo64194a(bhtx.f119585f);
                        for (bhro bhro : bhsi.f119448c.values()) {
                            bhro.mo64194a(bhtx.f119585f);
                        }
                    }
                } else {
                    bhuj.m101555a();
                }
                bhso.m101457a(this.f119466a);
            }
            bhuj.m101555a();
            bhuk bhuk = this.f119466a.f119478c;
            bxvd da = bpnd.f138387h.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpnd bpnd = (bpnd) da.f164949b;
            int i5 = bpnd.f138389a | 2;
            bpnd.f138389a = i5;
            bpnd.f138391c = size;
            int i6 = 4 | i5;
            bpnd.f138389a = i6;
            bpnd.f138392d = length;
            int i7 = i6 | 16;
            bpnd.f138389a = i7;
            bpnd.f138394f = true;
            bpnd.f138395g = i - 1;
            bpnd.f138389a = i7 | 32;
            bicx bicx = (bicx) bhuk;
            bicx.mo64534a(bicx.mo64531a((bpnd) da.mo74062i()));
            if (i != 2) {
                this.f119466a.f119483h.f119586a++;
                return;
            }
            this.f119466a.f119483h.f119587b++;
            return;
        }
        bhuj.m101555a().mo64360b("L1 data loaded while InferenceDataManager stopped - ignoring");
    }
}
