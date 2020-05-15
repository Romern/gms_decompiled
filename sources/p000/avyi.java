package p000;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;

/* renamed from: avyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avyi extends avxv {

    /* renamed from: c */
    private final avyv f94105c;

    private avyi() {
        throw new IllegalStateException("Default constructor called");
    }

    /* renamed from: a */
    public final SparseArray mo51710a(avxy avxy) {
        Barcode[] barcodeArr;
        if (avxy != null) {
            FrameMetadataParcel a = FrameMetadataParcel.m93781a(avxy);
            Bitmap bitmap = avxy.f94097c;
            if (bitmap == null) {
                ByteBuffer a2 = avxy.mo51715a();
                avyv avyv = this.f94105c;
                if (avyv.mo51757b()) {
                    try {
                        vzr a3 = vzs.m41642a(a2);
                        avyw avyw = (avyw) avyv.mo51759d();
                        Parcel bj = avyw.mo8529bj();
                        dcl.m8164a(bj, a3);
                        dcl.m8165a(bj, a);
                        Parcel a4 = avyw.mo8526a(1, bj);
                        barcodeArr = (Barcode[]) a4.createTypedArray(Barcode.CREATOR);
                        a4.recycle();
                    } catch (RemoteException e) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
                        barcodeArr = new Barcode[0];
                    }
                } else {
                    barcodeArr = new Barcode[0];
                }
            } else {
                avyv avyv2 = this.f94105c;
                if (avyv2.mo51757b()) {
                    try {
                        vzr a5 = vzs.m41642a(bitmap);
                        avyw avyw2 = (avyw) avyv2.mo51759d();
                        Parcel bj2 = avyw2.mo8529bj();
                        dcl.m8164a(bj2, a5);
                        dcl.m8165a(bj2, a);
                        Parcel a6 = avyw2.mo8526a(2, bj2);
                        barcodeArr = (Barcode[]) a6.createTypedArray(Barcode.CREATOR);
                        a6.recycle();
                    } catch (RemoteException e2) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e2);
                        barcodeArr = new Barcode[0];
                    }
                } else {
                    barcodeArr = new Barcode[0];
                }
                if (barcodeArr == null) {
                    throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
                }
            }
            int length = barcodeArr.length;
            SparseArray sparseArray = new SparseArray(length);
            for (Barcode barcode : barcodeArr) {
                sparseArray.append(barcode.f109608b.hashCode(), barcode);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }

    /* renamed from: b */
    public final boolean mo51712b() {
        return this.f94105c.mo51757b();
    }

    public avyi(avyv avyv) {
        this.f94105c = avyv;
    }

    /* renamed from: a */
    public final void mo51711a() {
        super.mo51711a();
        this.f94105c.mo51758c();
    }
}
