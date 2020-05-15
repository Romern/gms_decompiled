package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apfn();

    /* renamed from: a */
    public String f107325a;

    /* renamed from: b */
    public DataHolder f107326b;

    /* renamed from: c */
    public ParcelFileDescriptor f107327c;

    /* renamed from: d */
    public long f107328d;

    /* renamed from: e */
    public byte[] f107329e;

    /* renamed from: f */
    public byte[] f107330f;

    /* renamed from: g */
    public File f107331g;

    static {
        SafeBrowsingData.class.getSimpleName();
    }

    public SafeBrowsingData() {
        this(null, null, null, 0, null);
    }

    /* renamed from: a */
    private static final void m92326a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0043  */
    public final void writeToParcel(Parcel parcel, int i) {
        FileOutputStream fileOutputStream;
        File file;
        File file2 = null;
        if (this.f107327c == null && this.f107330f != null) {
            File file3 = this.f107331g;
            if (file3 != null) {
                try {
                    file = File.createTempFile("xlb", ".tmp", file3);
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        this.f107327c = ParcelFileDescriptor.open(file, 268435456);
                        if (file != null) {
                            file.delete();
                        }
                    } catch (IOException e) {
                        if (file == null) {
                        }
                        if (fileOutputStream != null) {
                        }
                        apfn.m70155a(this, parcel, i);
                        this.f107327c = null;
                    } catch (Throwable th) {
                        th = th;
                        file2 = file;
                        if (file2 != null) {
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    file = null;
                    if (file == null) {
                        file.delete();
                        fileOutputStream = null;
                    } else {
                        fileOutputStream = null;
                    }
                    if (fileOutputStream != null) {
                    }
                    apfn.m70155a(this, parcel, i);
                    this.f107327c = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (file2 != null) {
                        file2.delete();
                    }
                    throw th;
                }
            } else {
                fileOutputStream = null;
            }
            if (fileOutputStream != null) {
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                try {
                    dataOutputStream.writeInt(this.f107330f.length);
                    dataOutputStream.write(this.f107330f);
                    m92326a(dataOutputStream);
                    apfn.m70155a(this, parcel, i | 1);
                } catch (IOException e3) {
                    m92326a(dataOutputStream);
                } catch (Throwable th3) {
                    m92326a(dataOutputStream);
                    throw th3;
                }
                this.f107327c = null;
            }
        }
        apfn.m70155a(this, parcel, i);
        this.f107327c = null;
    }

    public SafeBrowsingData(String str) {
        this(str, null, null, 0, null);
    }

    public SafeBrowsingData(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j, byte[] bArr) {
        this.f107325a = str;
        this.f107326b = dataHolder;
        this.f107327c = parcelFileDescriptor;
        this.f107328d = j;
        this.f107329e = bArr;
    }
}
