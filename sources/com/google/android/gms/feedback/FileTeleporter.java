package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FileTeleporter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wxd();

    /* renamed from: a */
    public ParcelFileDescriptor f31607a;

    /* renamed from: b */
    public final String f31608b;

    /* renamed from: c */
    public final String f31609c;

    /* renamed from: d */
    public byte[] f31610d;

    /* renamed from: e */
    private File f31611e;

    public FileTeleporter(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.f31607a = parcelFileDescriptor;
        this.f31608b = str;
        this.f31609c = str2;
    }

    /* renamed from: a */
    public static final void m23395a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f31607a == null) {
            File file = this.f31611e;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.f31607a = ParcelFileDescriptor.open(createTempFile, 268435456);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                        try {
                            dataOutputStream.writeInt(this.f31610d.length);
                            dataOutputStream.writeUTF(this.f31608b);
                            dataOutputStream.writeUTF(this.f31609c);
                            dataOutputStream.write(this.f31610d);
                            m23395a(dataOutputStream);
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not write into unlinked file", e);
                        } catch (Throwable th) {
                            m23395a(dataOutputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException e2) {
                        throw new IllegalStateException("Temporary file is somehow already deleted.");
                    }
                } catch (IOException e3) {
                    throw new IllegalStateException("Could not create temporary file:", e3);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
            }
        }
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f31607a, i, false);
        see.m35046a(parcel, 3, this.f31608b, false);
        see.m35046a(parcel, 4, this.f31609c, false);
        see.m35062b(parcel, a);
    }

    public FileTeleporter(byte[] bArr, String str, String str2) {
        this((ParcelFileDescriptor) null, str, str2);
        this.f31610d = bArr;
    }

    /* renamed from: a */
    public final void mo18618a(File file) {
        if (file != null) {
            this.f31611e = file;
            return;
        }
        throw new NullPointerException("Cannot set null temp directory");
    }
}
