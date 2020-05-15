package p000;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: sta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sta extends bnch {

    /* renamed from: a */
    private final DataInputStream f45115a;

    /* renamed from: b */
    private final long f45116b;

    /* renamed from: c */
    private final Class f45117c;

    /* renamed from: d */
    private final bxxk f45118d;

    /* renamed from: e */
    private long f45119e = 0;

    /* renamed from: f */
    private byte[] f45120f = new byte[1024];

    public sta(FileInputStream fileInputStream, long j, Class cls, bxxk bxxk) {
        this.f45115a = new DataInputStream(new BufferedInputStream(fileInputStream));
        this.f45116b = j;
        this.f45117c = cls;
        this.f45118d = bxxk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        bxxc bxxc;
        try {
            long j = this.f45119e;
            long j2 = this.f45116b;
            if (j < j2) {
                if (j2 >= 4) {
                    int readInt = this.f45115a.readInt();
                    this.f45119e += 4;
                    if (readInt >= 0) {
                        if (readInt <= ((Integer) rsv.f43616e.mo25081c()).intValue()) {
                            long j3 = (long) readInt;
                            if (this.f45119e + j3 + 8 <= this.f45116b) {
                                sdo.m34974b(true);
                                int length = this.f45120f.length;
                                if (length < readInt) {
                                    while (length < readInt) {
                                        length += length;
                                    }
                                    this.f45120f = new byte[length];
                                }
                                this.f45115a.read(this.f45120f, 0, readInt);
                                this.f45119e += j3;
                                long readLong = this.f45115a.readLong();
                                this.f45119e += 8;
                                bxxc = stb.m36280a(this.f45120f, 0, readInt, readLong) ? stb.m36275a(this.f45120f, 0, readInt, this.f45117c, this.f45118d) : null;
                            }
                        }
                    }
                    Log.e("ProtoLiteUtils", String.format("Read bad message size: %d. (pos=%d, len=%d)", Integer.valueOf(readInt), Long.valueOf(this.f45119e), Long.valueOf(this.f45116b)));
                    bxxc = null;
                } else {
                    Log.e("ProtoLiteUtils", "File too short to contain valid data");
                    bxxc = null;
                }
                if (bxxc != null) {
                    return bxxc;
                }
                Log.e("ProtoLiteUtils", "Failed to read a valid message from the file.");
            }
        } catch (IOException e) {
            Log.e("ProtoLiteUtils", "Exception while reading from file.", e);
        }
        mo67118d();
        return null;
    }
}
