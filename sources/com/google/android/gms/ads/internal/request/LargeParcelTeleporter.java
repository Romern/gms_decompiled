package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LargeParcelTeleporter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0548i();

    /* renamed from: a */
    ParcelFileDescriptor f8689a;

    /* renamed from: b */
    private Parcelable f8690b;

    /* renamed from: c */
    private boolean f8691c;

    public LargeParcelTeleporter(ParcelFileDescriptor parcelFileDescriptor) {
        this.f8689a = parcelFileDescriptor;
        this.f8690b = null;
        this.f8691c = true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final ParcelFileDescriptor mo6717a() {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f8689a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f8690b.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                    try {
                        C0645d.f8973a.execute(new C0547h(autoCloseOutputStream, marshall));
                        parcelFileDescriptor = createPipe[0];
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (IOException e2) {
                    e = e2;
                    autoCloseOutputStream = null;
                    C0633h.m5669b("Error transporting the ad response", e);
                    C0387d.m5366d().mo6783a(e, "LargeParcelTeleporter.pipeData.2");
                    srz.m36171a(autoCloseOutputStream);
                    this.f8689a = parcelFileDescriptor;
                    return this.f8689a;
                }
                this.f8689a = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.f8689a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        mo6717a();
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f8689a, i, false);
        see.m35062b(parcel, a);
    }

    public LargeParcelTeleporter(SafeParcelable safeParcelable) {
        this.f8689a = null;
        this.f8690b = safeParcelable;
        this.f8691c = false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final SafeParcelable mo6718a(Parcelable.Creator creator) {
        if (this.f8691c) {
            ParcelFileDescriptor parcelFileDescriptor = this.f8689a;
            if (parcelFileDescriptor != null) {
                DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    srz.m36171a((Closeable) dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.f8690b = (Parcelable) creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.f8691c = false;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (IOException e) {
                    C0633h.m5669b("Could not read from parcel file descriptor", e);
                    srz.m36171a((Closeable) dataInputStream);
                    return null;
                } catch (Throwable th2) {
                    srz.m36171a((Closeable) dataInputStream);
                    throw th2;
                }
            } else {
                C0633h.m5668b("File descriptor is empty, returning null.");
                return null;
            }
        }
        return (SafeParcelable) this.f8690b;
    }
}
