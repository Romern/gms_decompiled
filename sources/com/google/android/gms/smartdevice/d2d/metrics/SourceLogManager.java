package com.google.android.gms.smartdevice.d2d.metrics;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SourceLogManager implements Parcelable {
    public static final Parcelable.Creator CREATOR = new armi();

    /* renamed from: a */
    public static final sek f108003a = ascp.m73787a("Setup", "UI", "SourceLogManager");

    /* renamed from: b */
    public long f108004b;

    /* renamed from: c */
    public boolean f108005c;

    /* renamed from: d */
    public final Deque f108006d;

    /* renamed from: e */
    public qws f108007e;

    /* renamed from: f */
    public Context f108008f;

    /* renamed from: g */
    private int f108009g;

    public SourceLogManager() {
        this.f108009g = 1;
        this.f108006d = new ArrayDeque();
        srb srb = srb.f45012a;
    }

    /* renamed from: a */
    private final void m92723a(bovw bovw) {
        bxvd da = bovc.f134986j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bovc bovc = (bovc) da.f164949b;
        bovw.getClass();
        bovc.f134990c = bovw;
        int i = bovc.f134988a | 2;
        bovc.f134988a = i;
        long j = this.f108004b;
        bovc.f134988a = i | 1;
        bovc.f134989b = j;
        if (!cgqs.f187523a.mo6606a().mo84334t()) {
            f108003a.mo25412b("Clearcut logging is disabled", new Object[0]);
            return;
        }
        if (this.f108007e == null) {
            Context context = this.f108008f;
            if (context != null) {
                this.f108007e = new qws(context, "SMART_SETUP", null);
            } else {
                throw new IllegalStateException("Context is null");
            }
        }
        this.f108007e.mo24335a(((bovc) da.mo74062i()).mo73642k()).mo24327b();
        f108003a.mo25409a("UI event %s", bovw);
    }

    /* renamed from: b */
    public final void mo59116b() {
        bxvd da = bovw.f135063l.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bovw bovw = (bovw) da.f164949b;
        bovw.f135067c = 6;
        bovw.f135065a |= 2;
        mo59115a(da);
    }

    /* renamed from: c */
    public final void mo59117c() {
        bxvd da = bovw.f135063l.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bovw bovw = (bovw) da.f164949b;
        bovw.f135067c = 16;
        bovw.f135065a |= 2;
        mo59115a(da);
    }

    /* renamed from: d */
    public final void mo59118d() {
        bxvd da = bovw.f135063l.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bovw bovw = (bovw) da.f164949b;
        bovw.f135067c = 18;
        bovw.f135065a |= 2;
        mo59115a(da);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void mo59120e() {
        synchronized (this.f108006d) {
            if (!this.f108005c) {
                this.f108004b = ascn.m73780a();
                this.f108005c = true;
            }
            while (!this.f108006d.isEmpty()) {
                m92723a((bovw) this.f108006d.pop());
            }
        }
    }

    public final synchronized void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList;
        parcel.writeInt(this.f108009g);
        parcel.writeLong(this.f108004b);
        parcel.writeByte(this.f108005c ? (byte) 1 : 0);
        synchronized (this.f108006d) {
            arrayList = new ArrayList(this.f108006d.size());
            for (bovw bovw : this.f108006d) {
                arrayList.add(bovw.mo73642k());
            }
        }
        parcel.writeList(arrayList);
    }

    public SourceLogManager(Context context) {
        this((byte[]) null);
        this.f108008f = context;
    }

    public SourceLogManager(Parcel parcel) {
        this((byte[]) null);
        boolean z;
        this.f108009g = parcel.readInt();
        this.f108004b = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f108005c = z;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, byte[].class.getClassLoader());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            try {
                this.f108006d.add((bovw) GeneratedMessageLite.m124016a(bovw.f135063l, bArr, bxus.m123744c()));
            } catch (bxwf e) {
                f108003a.mo25417e("Failed to unparcel mEventQueue with %s", e, new Object[0]);
            }
        }
    }

    public SourceLogManager(byte[] bArr) {
        this.f108009g = 1;
        this.f108006d = new ArrayDeque();
    }

    /* renamed from: a */
    public final void mo59110a() {
        bxvd da = bovw.f135063l.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bovw bovw = (bovw) da.f164949b;
        bovw.f135067c = 2;
        bovw.f135065a = 2 | bovw.f135065a;
        mo59115a(da);
    }

    /* renamed from: a */
    public final void mo59111a(int i) {
        bxvd da = bovw.f135063l.mo74144da();
        if (i == -1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovw bovw = (bovw) da.f164949b;
            bovw.f135067c = 9;
            bovw.f135065a |= 2;
        } else if (i == 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovw bovw2 = (bovw) da.f164949b;
            bovw2.f135067c = 11;
            bovw2.f135065a |= 2;
        } else if (i == 2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovw bovw3 = (bovw) da.f164949b;
            bovw3.f135067c = 12;
            bovw3.f135065a |= 2;
        } else if (i == 3) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovw bovw4 = (bovw) da.f164949b;
            bovw4.f135067c = 13;
            bovw4.f135065a |= 2;
        } else if (i == 4) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovw bovw5 = (bovw) da.f164949b;
            bovw5.f135067c = 15;
            bovw5.f135065a |= 2;
        } else if (i != 5) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovw bovw6 = (bovw) da.f164949b;
            bovw6.f135067c = 0;
            bovw6.f135065a = 2 | bovw6.f135065a;
            sek sek = f108003a;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown setup result: ");
            sb.append(i);
            sek.mo25418e(sb.toString(), new Object[0]);
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovw bovw7 = (bovw) da.f164949b;
            bovw7.f135067c = 19;
            bovw7.f135065a |= 2;
        }
        mo59115a(da);
        mo59120e();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo59112a(int i, byte b, boolean z, int i2) {
        bxvd da = bovw.f135063l.mo74144da();
        bxvd da2 = bovm.f135027f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bovm bovm = (bovm) da2.f164949b;
        int i3 = bovm.f135029a | 1;
        bovm.f135029a = i3;
        bovm.f135030b = i;
        int i4 = 4;
        int i5 = i3 | 4;
        bovm.f135029a = i5;
        bovm.f135032d = z;
        int i6 = i2 - 1;
        if (i2 != 0) {
            bovm.f135033e = i6;
            int i7 = i5 | 8;
            bovm.f135029a = i7;
            switch (b) {
                case 0:
                    bovm.f135031c = 0;
                    bovm.f135029a = i7 | 2;
                    break;
                case 1:
                    i4 = 5;
                    bovm.f135031c = i4;
                    bovm.f135029a = i7 | 2;
                    break;
                case 2:
                    i4 = 6;
                    bovm.f135031c = i4;
                    bovm.f135029a = i7 | 2;
                    break;
                case 3:
                    bovm.f135031c = 2;
                    bovm.f135029a = i7 | 2;
                    break;
                case 4:
                    bovm.f135031c = i4;
                    bovm.f135029a = i7 | 2;
                    break;
                case 5:
                    bovm.f135031c = 3;
                    bovm.f135029a = i7 | 2;
                    break;
                case 6:
                    i4 = 7;
                    bovm.f135031c = i4;
                    bovm.f135029a = i7 | 2;
                    break;
                default:
                    bovm.f135031c = 0;
                    bovm.f135029a = i7 | 2;
                    sek sek = f108003a;
                    StringBuilder sb = new StringBuilder(35);
                    sb.append("Unknown discovery device type: ");
                    sb.append((int) b);
                    sek.mo25418e(sb.toString(), new Object[0]);
                    break;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovw bovw = (bovw) da.f164949b;
            bovw.f135067c = 3;
            bovw.f135065a |= 2;
            bovm bovm2 = (bovm) da2.mo74062i();
            bovm2.getClass();
            bovw.f135070f = bovm2;
            bovw.f135065a |= 64;
            mo59115a(da);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo59113a(int i, int i2) {
        bxvd da = bovw.f135063l.mo74144da();
        bxvd da2 = bovv.f135058d.mo74144da();
        int a = arqi.m73306a(i);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bovv bovv = (bovv) da2.f164949b;
        bovv.f135061b = a - 1;
        bovv.f135060a |= 1;
        if (a == 1) {
            sek sek = f108003a;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown trigger type: ");
            sb.append(i);
            sek.mo25418e(sb.toString(), new Object[0]);
        }
        if (i2 == -1) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bovv bovv2 = (bovv) da2.f164949b;
            bovv2.f135062c = 3;
            bovv2.f135060a |= 2;
        } else if (i2 == 0) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bovv bovv3 = (bovv) da2.f164949b;
            bovv3.f135062c = 1;
            bovv3.f135060a |= 2;
        } else if (i2 == 1) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bovv bovv4 = (bovv) da2.f164949b;
            bovv4.f135062c = 2;
            bovv4.f135060a |= 2;
        } else if (i2 == 6) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bovv bovv5 = (bovv) da2.f164949b;
            bovv5.f135062c = 4;
            bovv5.f135060a |= 2;
        } else if (i2 == 7) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bovv bovv6 = (bovv) da2.f164949b;
            bovv6.f135062c = 5;
            bovv6.f135060a |= 2;
        } else if (i2 == 9) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bovv bovv7 = (bovv) da2.f164949b;
            bovv7.f135062c = 6;
            bovv7.f135060a |= 2;
        } else if (i2 != 17) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bovv bovv8 = (bovv) da2.f164949b;
            bovv8.f135062c = 8;
            bovv8.f135060a |= 2;
            sek sek2 = f108003a;
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("Unknown connection type: ");
            sb2.append(i2);
            sek2.mo25416d(sb2.toString(), new Object[0]);
        } else {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bovv bovv9 = (bovv) da2.f164949b;
            bovv9.f135062c = 7;
            bovv9.f135060a |= 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bovw bovw = (bovw) da.f164949b;
        bovw.f135067c = 1;
        bovw.f135065a |= 2;
        bovv bovv10 = (bovv) da2.mo74062i();
        bovv10.getClass();
        bovw.f135069e = bovv10;
        bovw.f135065a |= 32;
        mo59115a(da);
    }

    /* renamed from: a */
    public final void mo59114a(arzx arzx) {
        bxvd da = bovw.f135063l.mo74144da();
        bxvd da2 = bovq.f135040h.mo74144da();
        int i = arzx.f88549b;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bovq bovq = (bovq) da2.f164949b;
        boolean z = true;
        int i2 = bovq.f135042a | 1;
        bovq.f135042a = i2;
        bovq.f135043b = i;
        int i3 = arzx.f88550c;
        int i4 = i2 | 4;
        bovq.f135042a = i4;
        bovq.f135045d = i3;
        int i5 = arzx.f88551d;
        int i6 = i4 | 8;
        bovq.f135042a = i6;
        bovq.f135046e = i5;
        if (arzx.f88548a == null) {
            z = false;
        }
        int i7 = i6 | 2;
        bovq.f135042a = i7;
        bovq.f135044c = z;
        boolean z2 = arzx.f88552e;
        int i8 = i7 | 16;
        bovq.f135042a = i8;
        bovq.f135047f = z2;
        boolean z3 = arzx.f88553f;
        bovq.f135042a = i8 | 32;
        bovq.f135048g = z3;
        bovq bovq2 = (bovq) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bovw bovw = (bovw) da.f164949b;
        bovw.f135067c = 5;
        int i9 = bovw.f135065a | 2;
        bovw.f135065a = i9;
        bovq2.getClass();
        bovw.f135072h = bovq2;
        bovw.f135065a = i9 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        mo59115a(da);
    }

    /* renamed from: a */
    public final void mo59115a(bxvd bxvd) {
        long currentTimeMillis = System.currentTimeMillis();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bovw bovw = (bovw) bxvd.f164949b;
        bovw bovw2 = bovw.f135063l;
        bovw.f135065a |= 8;
        bovw.f135068d = currentTimeMillis;
        synchronized (this.f108006d) {
            int i = this.f108009g;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bovw bovw3 = (bovw) bxvd.f164949b;
            bovw3.f135065a |= 1;
            bovw3.f135066b = i;
            this.f108009g++;
            if (!this.f108005c) {
                this.f108006d.add((bovw) bxvd.mo74062i());
            } else {
                m92723a((bovw) bxvd.mo74062i());
            }
        }
    }
}
