package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new rtn();

    /* renamed from: a */
    final int f30154a;

    /* renamed from: b */
    public ParcelFileDescriptor f30155b;

    /* renamed from: c */
    final int f30156c;

    /* renamed from: d */
    public boolean f30157d;

    /* renamed from: e */
    private Bitmap f30158e;

    /* renamed from: f */
    private File f30159f;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f30154a = i;
        this.f30155b = parcelFileDescriptor;
        this.f30156c = i2;
        this.f30158e = null;
        this.f30157d = false;
    }

    /* renamed from: a */
    private static final void m22533a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f30155b == null) {
            Bitmap bitmap = this.f30158e;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            File file = this.f30159f;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.f30155b = ParcelFileDescriptor.open(createTempFile, 268435456);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                        try {
                            dataOutputStream.writeInt(array.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(array);
                            m22533a(dataOutputStream);
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not write into unlinked file", e);
                        } catch (Throwable th) {
                            m22533a(dataOutputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException e2) {
                        throw new IllegalStateException("Temporary file is somehow already deleted");
                    }
                } catch (IOException e3) {
                    throw new IllegalStateException("Could not create temporary file", e3);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
        }
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f30154a);
        see.m35040a(parcel, 2, this.f30155b, i | 1, false);
        see.m35063b(parcel, 3, this.f30156c);
        see.m35062b(parcel, a);
        this.f30155b = null;
    }

    public BitmapTeleporter(Bitmap bitmap) {
        this.f30154a = 1;
        this.f30155b = null;
        this.f30156c = 0;
        this.f30158e = bitmap;
        this.f30157d = true;
    }

    /* renamed from: a */
    public final Bitmap mo17759a() {
        if (!this.f30157d) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f30155b));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                Bitmap.Config valueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                dataInputStream.read(bArr);
                m22533a(dataInputStream);
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                createBitmap.copyPixelsFromBuffer(wrap);
                this.f30158e = createBitmap;
                this.f30157d = true;
            } catch (IOException e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                m22533a(dataInputStream);
                throw th;
            }
        }
        return this.f30158e;
    }

    /* renamed from: a */
    public final void mo17760a(File file) {
        if (file != null) {
            this.f30159f = file;
            return;
        }
        throw new NullPointerException("Cannot set null temp directory");
    }
}
