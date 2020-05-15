package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.slice.SliceSpec;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aqa {

    /* renamed from: a */
    private final Context f1971a;

    /* renamed from: b */
    public final apg f1972b;

    /* renamed from: c */
    private final aqf f1973c;

    /* renamed from: d */
    private final List f1974d;

    public aqa(Context context, Uri uri) {
        this.f1972b = new apg(uri);
        this.f1971a = context;
        apl a = apl.m1813a(context);
        int i = Build.VERSION.SDK_INT;
        this.f1974d = new ArrayList(aph.m1810b(a.f1930a.getPinnedSpecs(uri)));
        aqf a2 = mo2284a();
        this.f1973c = a2;
        if (a2 != null) {
            mo2285a(a2);
            return;
        }
        throw new IllegalArgumentException("No valid specs found");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public aqf mo2284a() {
        throw null;
    }

    /* renamed from: a */
    public abstract void mo2285a(aqf aqf);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo2291a(SliceSpec sliceSpec) {
        int size = this.f1974d.size();
        for (int i = 0; i < size; i++) {
            SliceSpec sliceSpec2 = (SliceSpec) this.f1974d.get(i);
            if (sliceSpec2.f1670a.equals(sliceSpec.f1670a) && sliceSpec2.f1671b >= sliceSpec.f1671b) {
                return true;
            }
        }
        return false;
    }
}
