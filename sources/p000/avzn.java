package p000;

import android.content.Context;
import com.google.android.gms.vision.clearcut.VisionClearcutLogger;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: avzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avzn {

    /* renamed from: a */
    public static final SortedSet f94116a;

    /* renamed from: b */
    public final Context f94117b;

    /* renamed from: c */
    public final VisionClearcutLogger f94118c;

    static {
        TreeSet treeSet = new TreeSet();
        f94116a = treeSet;
        treeSet.add("barcode");
        f94116a.add("face");
        f94116a.add("ocr");
        f94116a.add("ica");
    }

    public avzn(Context context) {
        this.f94117b = context;
        VisionClearcutLogger visionClearcutLogger = new VisionClearcutLogger(context);
        this.f94118c = visionClearcutLogger;
        visionClearcutLogger.f109686a = true;
    }

    /* renamed from: a */
    public final Set mo51762a() {
        return avzo.m79551b(this.f94117b);
    }
}
