package p000;

import android.content.Context;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;

/* renamed from: avyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avyv extends avzl {

    /* renamed from: a */
    private final BarcodeDetectorOptions f94106a;

    public avyv(Context context, BarcodeDetectorOptions barcodeDetectorOptions) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.f94106a = barcodeDetectorOptions;
        mo51759d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51745a(waq waq, Context context) {
        avyz asInterface = avyy.asInterface(waq.mo29007a("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator"));
        if (asInterface != null) {
            return asInterface.newBarcodeDetector$ar$class_merging(vzs.m41642a(context), this.f94106a);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51746a() {
        if (mo51757b()) {
            avyw avyw = (avyw) mo51759d();
            avyw.mo8528b(3, avyw.mo8529bj());
        }
    }
}
