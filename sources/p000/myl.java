package p000;

import android.app.backup.BackupDataOutput;

/* renamed from: myl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class myl {

    /* renamed from: a */
    public int f34939a = -1;

    /* renamed from: b */
    private final BackupDataOutput f34940b;

    /* renamed from: c */
    private String f34941c = null;

    /* renamed from: d */
    private int f34942d = 0;

    /* renamed from: e */
    private int f34943e = 0;

    public myl(BackupDataOutput backupDataOutput) {
        this.f34940b = backupDataOutput;
    }

    /* renamed from: a */
    public final void mo20312a(String str, int i, int i2, byte[] bArr) {
        String str2 = this.f34941c;
        if (str2 != null && str.compareTo(str2) < 0) {
            String str3 = this.f34941c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(str3).length());
            sb.append("Out of order: ");
            sb.append(str);
            sb.append(" < ");
            sb.append(str3);
            throw new myk(sb.toString());
        }
        if (!str.equals(this.f34941c)) {
            int i3 = this.f34942d;
            int i4 = this.f34943e;
            if (i3 == i4) {
                this.f34941c = str;
                this.f34939a = -1;
            } else {
                String str4 = this.f34941c;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 66 + String.valueOf(str4).length());
                sb2.append("Insufficient data: ");
                sb2.append(str);
                sb2.append(" follows ");
                sb2.append(str4);
                sb2.append(" written=");
                sb2.append(i4);
                sb2.append(" total=");
                sb2.append(i3);
                throw new myk(sb2.toString());
            }
        }
        int i5 = this.f34939a;
        if (i5 == -2) {
            return;
        }
        if (i == i5 + 1) {
            if (i == 0) {
                this.f34940b.writeEntityHeader(str, i2);
                this.f34942d = i2;
                this.f34943e = 0;
            }
            int i6 = this.f34943e;
            int length = bArr.length;
            int i7 = this.f34942d;
            if (i6 + length > i7) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 85);
                sb3.append("Excess data: ");
                sb3.append(str);
                sb3.append(" part=");
                sb3.append(i);
                sb3.append(" size=");
                sb3.append(length);
                sb3.append(" written=");
                sb3.append(i6);
                sb3.append(" total=");
                sb3.append(i7);
                throw new myk(sb3.toString());
            } else if (i2 == i7) {
                this.f34940b.writeEntityData(bArr, length);
                this.f34939a = i;
                this.f34943e += length;
            } else {
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 81);
                sb4.append("Inconsistent size: ");
                sb4.append(str);
                sb4.append(" part=");
                sb4.append(i);
                sb4.append(" total=");
                sb4.append(i2);
                sb4.append(" previous total=");
                sb4.append(i7);
                throw new myk(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 56);
            sb5.append("Out of order: ");
            sb5.append(str);
            sb5.append(" part=");
            sb5.append(i);
            sb5.append(" follows part=");
            sb5.append(i5);
            throw new myk(sb5.toString());
        }
    }
}
