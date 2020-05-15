package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.vision.text.internal.client.TextRecognizerOptions;

/* renamed from: awac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awac extends avzl {

    /* renamed from: a */
    private final TextRecognizerOptions f94130a;

    public awac(Context context, TextRecognizerOptions textRecognizerOptions) {
        super(context, "TextNativeHandle", "ocr");
        this.f94130a = textRecognizerOptions;
        mo51759d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51745a(waq waq, Context context) {
        avzy avzy;
        IBinder a = waq.mo29007a("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
        avzx avzx = null;
        if (a != null) {
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
            avzy = queryLocalInterface instanceof avzy ? (avzy) queryLocalInterface : new avzy(a);
        } else {
            avzy = null;
        }
        if (avzy == null) {
            return null;
        }
        vzr a2 = vzs.m41642a(context);
        TextRecognizerOptions textRecognizerOptions = this.f94130a;
        Parcel bj = avzy.mo8529bj();
        dcl.m8164a(bj, a2);
        dcl.m8165a(bj, textRecognizerOptions);
        Parcel a3 = avzy.mo8526a(1, bj);
        IBinder readStrongBinder = a3.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            if (queryLocalInterface2 instanceof avzx) {
                avzx = (avzx) queryLocalInterface2;
            } else {
                avzx = new avzx(readStrongBinder);
            }
        }
        a3.recycle();
        return avzx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51746a() {
        avzx avzx = (avzx) mo51759d();
        avzx.mo8528b(2, avzx.mo8529bj());
    }
}
