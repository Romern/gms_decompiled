package p000;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: qj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1298qj {

    /* renamed from: a */
    public static final C1298qj f26860a = new C1298qj(1, (CharSequence) null);

    /* renamed from: b */
    public static final C1298qj f26861b = new C1298qj(2, (CharSequence) null);

    /* renamed from: c */
    public static final C1298qj f26862c = new C1298qj(16, (CharSequence) null);

    /* renamed from: d */
    public static final C1298qj f26863d = new C1298qj(32, (CharSequence) null);

    /* renamed from: e */
    public static final C1298qj f26864e = new C1298qj(4096, (CharSequence) null);

    /* renamed from: f */
    public static final C1298qj f26865f = new C1298qj(8192, (CharSequence) null);

    /* renamed from: g */
    public static final C1298qj f26866g = new C1298qj((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE, (CharSequence) null);

    /* renamed from: h */
    public static final C1298qj f26867h = new C1298qj((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS, (CharSequence) null);

    /* renamed from: i */
    public static final C1298qj f26868i = new C1298qj(1048576, (CharSequence) null);

    /* renamed from: j */
    public static final C1298qj f26869j = new C1298qj(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);

    /* renamed from: k */
    public static final C1298qj f26870k = new C1298qj(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);

    /* renamed from: l */
    final Object f26871l;

    /* renamed from: m */
    public final int f26872m;

    /* renamed from: n */
    public final Class f26873n;

    /* renamed from: o */
    public final C1314qz f26874o;

    static {
        new C1298qj(4, (CharSequence) null);
        new C1298qj(8, (CharSequence) null);
        new C1298qj(64, (CharSequence) null);
        new C1298qj(128, (CharSequence) null);
        new C1298qj((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, C1307qs.class);
        new C1298qj(512, C1307qs.class);
        new C1298qj(1024, C1308qt.class);
        new C1298qj(2048, C1308qt.class);
        new C1298qj((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES, (CharSequence) null);
        new C1298qj((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT, (CharSequence) null);
        new C1298qj((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE, (CharSequence) null);
        new C1298qj((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE, C1312qx.class);
        new C1298qj(2097152, C1313qy.class);
        int i = Build.VERSION.SDK_INT;
        new C1298qj(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        int i2 = Build.VERSION.SDK_INT;
        new C1298qj(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, C1310qv.class);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = Build.VERSION.SDK_INT;
        new C1298qj(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        int i5 = Build.VERSION.SDK_INT;
        int i6 = Build.VERSION.SDK_INT;
        new C1298qj(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
        int i7 = Build.VERSION.SDK_INT;
        new C1298qj(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, 16908358, null, null, null);
        int i8 = Build.VERSION.SDK_INT;
        new C1298qj(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, 16908359, null, null, null);
        int i9 = Build.VERSION.SDK_INT;
        new C1298qj(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, 16908360, null, null, null);
        int i10 = Build.VERSION.SDK_INT;
        new C1298qj(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, 16908361, null, null, null);
        int i11 = Build.VERSION.SDK_INT;
        new C1298qj(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        int i12 = Build.VERSION.SDK_INT;
        new C1298qj(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, C1311qw.class);
        int i13 = Build.VERSION.SDK_INT;
        new C1298qj(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, null, null, C1309qu.class);
        int i14 = Build.VERSION.SDK_INT;
        new C1298qj(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, 16908356, null, null, null);
        int i15 = Build.VERSION.SDK_INT;
        new C1298qj(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, 16908357, null, null, null);
    }

    public C1298qj(int i, CharSequence charSequence) {
        this(null, i, charSequence, null, null);
    }

    /* renamed from: a */
    public final int mo15748a() {
        int i = Build.VERSION.SDK_INT;
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f26871l).getId();
    }

    /* renamed from: b */
    public final CharSequence mo15749b() {
        int i = Build.VERSION.SDK_INT;
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f26871l).getLabel();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1298qj)) {
            return false;
        }
        C1298qj qjVar = (C1298qj) obj;
        Object obj2 = this.f26871l;
        if (obj2 != null) {
            if (obj2.equals(qjVar.f26871l)) {
                return true;
            }
            return false;
        } else if (qjVar.f26871l != null) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.f26871l;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private C1298qj(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public C1298qj(Object obj, int i, CharSequence charSequence, C1314qz qzVar, Class cls) {
        this.f26872m = i;
        this.f26874o = qzVar;
        int i2 = Build.VERSION.SDK_INT;
        this.f26871l = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
        this.f26873n = cls;
    }
}
