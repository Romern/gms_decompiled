package p000;

import android.content.Context;
import com.google.android.gms.vision.text.internal.client.TextRecognizerOptions;

/* renamed from: avzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avzu {

    /* renamed from: a */
    private final Context f94127a;

    /* renamed from: b */
    private final TextRecognizerOptions f94128b = new TextRecognizerOptions();

    public avzu(Context context) {
        this.f94127a = context;
    }

    /* renamed from: a */
    public final avzv mo51763a() {
        return new avzv(new awac(this.f94127a, this.f94128b));
    }
}
