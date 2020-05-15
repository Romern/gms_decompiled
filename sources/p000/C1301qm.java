package p000;

import android.graphics.Rect;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: qm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1301qm {

    /* renamed from: a */
    public final AccessibilityNodeInfo f26877a;

    /* renamed from: b */
    public int f26878b = -1;

    /* renamed from: c */
    public int f26879c = -1;

    private C1301qm(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f26877a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    private final List m20015a(String str) {
        int i = Build.VERSION.SDK_INT;
        ArrayList<Integer> integerArrayList = this.f26877a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f26877a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    @Deprecated
    /* renamed from: b */
    public final void mo15759b(Rect rect) {
        this.f26877a.setBoundsInParent(rect);
    }

    /* renamed from: c */
    public final void mo15765c(Rect rect) {
        this.f26877a.getBoundsInScreen(rect);
    }

    /* renamed from: d */
    public final void mo15769d(Rect rect) {
        this.f26877a.setBoundsInScreen(rect);
    }

    /* renamed from: e */
    public final void mo15773e(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        this.f26877a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1301qm)) {
            C1301qm qmVar = (C1301qm) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f26877a;
            if (accessibilityNodeInfo != null) {
                if (!accessibilityNodeInfo.equals(qmVar.f26877a)) {
                    return false;
                }
            } else if (qmVar.f26877a != null) {
                return false;
            }
            return this.f26879c == qmVar.f26879c && this.f26878b == qmVar.f26878b;
        }
    }

    /* renamed from: f */
    public final void mo15777f(boolean z) {
        this.f26877a.setClickable(z);
    }

    /* renamed from: g */
    public final CharSequence mo15779g() {
        return this.f26877a.getClassName();
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f26877a;
        if (accessibilityNodeInfo != null) {
            return accessibilityNodeInfo.hashCode();
        }
        return 0;
    }

    /* renamed from: i */
    public final CharSequence mo15784i() {
        return this.f26877a.getContentDescription();
    }

    /* renamed from: j */
    public final void mo15786j() {
        this.f26877a.setLongClickable(false);
    }

    public final String toString() {
        List list;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo15753a(rect);
        sb.append("; boundsInParent: " + rect);
        mo15765c(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f26877a.getPackageName());
        sb.append("; className: ");
        sb.append(mo15779g());
        sb.append("; text: ");
        sb.append(mo15781h());
        sb.append("; contentDescription: ");
        sb.append(mo15784i());
        sb.append("; viewId: ");
        int i = Build.VERSION.SDK_INT;
        sb.append(this.f26877a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f26877a.isCheckable());
        sb.append("; checked: ");
        sb.append(mo15764b());
        sb.append("; focusable: ");
        sb.append(mo15768c());
        sb.append("; focused: ");
        sb.append(this.f26877a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f26877a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f26877a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f26877a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(mo15772d());
        sb.append("; password: ");
        sb.append(mo15775e());
        sb.append("; scrollable: " + mo15778f());
        sb.append("; [");
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f26877a.getActionList();
        if (actionList != null) {
            list = new ArrayList();
            int size = actionList.size();
            for (int i4 = 0; i4 < size; i4++) {
                list.add(new C1298qj(actionList.get(i4), 0, null, null, null));
            }
        } else {
            list = Collections.emptyList();
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            C1298qj qjVar = (C1298qj) list.get(i5);
            int a = qjVar.mo15748a();
            if (a == 1) {
                str = "ACTION_FOCUS";
            } else if (a != 2) {
                switch (a) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case 32:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case PSKKeyManager.MAX_KEY_LENGTH_BYTES /*256*/:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES /*16384*/:
                        str = "ACTION_COPY";
                        break;
                    case AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT /*32768*/:
                        str = "ACTION_PASTE";
                        break;
                    case AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE /*65536*/:
                        str = "ACTION_CUT";
                        break;
                    case AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE /*131072*/:
                        str = "ACTION_SET_SELECTION";
                        break;
                    case AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE /*262144*/:
                        str = "ACTION_EXPAND";
                        break;
                    case AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS /*524288*/:
                        str = "ACTION_COLLAPSE";
                        break;
                    case 2097152:
                        str = "ACTION_SET_TEXT";
                        break;
                    case 16908354:
                        str = "ACTION_MOVE_WINDOW";
                        break;
                    default:
                        switch (a) {
                            case 16908342:
                                str = "ACTION_SHOW_ON_SCREEN";
                                break;
                            case 16908343:
                                str = "ACTION_SCROLL_TO_POSITION";
                                break;
                            case 16908344:
                                str = "ACTION_SCROLL_UP";
                                break;
                            case 16908345:
                                str = "ACTION_SCROLL_LEFT";
                                break;
                            case 16908346:
                                str = "ACTION_SCROLL_DOWN";
                                break;
                            case 16908347:
                                str = "ACTION_SCROLL_RIGHT";
                                break;
                            case 16908348:
                                str = "ACTION_CONTEXT_CLICK";
                                break;
                            case 16908349:
                                str = "ACTION_SET_PROGRESS";
                                break;
                            default:
                                switch (a) {
                                    case 16908356:
                                        str = "ACTION_SHOW_TOOLTIP";
                                        break;
                                    case 16908357:
                                        str = "ACTION_HIDE_TOOLTIP";
                                        break;
                                    case 16908358:
                                        str = "ACTION_PAGE_UP";
                                        break;
                                    case 16908359:
                                        str = "ACTION_PAGE_DOWN";
                                        break;
                                    case 16908360:
                                        str = "ACTION_PAGE_LEFT";
                                        break;
                                    case 16908361:
                                        str = "ACTION_PAGE_RIGHT";
                                        break;
                                    default:
                                        str = "ACTION_UNKNOWN";
                                        break;
                                }
                        }
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN") && qjVar.mo15749b() != null) {
                str = qjVar.mo15749b().toString();
            }
            sb.append(str);
            if (i5 != list.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo15760b(CharSequence charSequence) {
        this.f26877a.setText(charSequence);
    }

    /* renamed from: c */
    public final void mo15766c(CharSequence charSequence) {
        this.f26877a.setContentDescription(charSequence);
    }

    /* renamed from: d */
    public final void mo15770d(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        this.f26877a.setHintText(charSequence);
    }

    /* renamed from: e */
    public final void mo15774e(boolean z) {
        int i = Build.VERSION.SDK_INT;
        this.f26877a.setAccessibilityFocused(z);
    }

    /* renamed from: f */
    public final boolean mo15778f() {
        return this.f26877a.isScrollable();
    }

    /* renamed from: g */
    public final void mo15780g(boolean z) {
        this.f26877a.setEnabled(z);
    }

    /* renamed from: h */
    public final CharSequence mo15781h() {
        if (m20015a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            return this.f26877a.getText();
        }
        List a = m20015a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List a2 = m20015a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List a3 = m20015a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List a4 = m20015a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f26877a.getText(), 0, this.f26877a.getText().length()));
        for (int i = 0; i < a.size(); i++) {
            int intValue = ((Integer) a4.get(i)).intValue();
            int i2 = Build.VERSION.SDK_INT;
            spannableString.setSpan(new C1297qi(intValue, this, this.f26877a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) a.get(i)).intValue(), ((Integer) a2.get(i)).intValue(), ((Integer) a3.get(i)).intValue());
        }
        return spannableString;
    }

    /* renamed from: i */
    public final void mo15785i(boolean z) {
        int i = Build.VERSION.SDK_INT;
        this.f26877a.setDismissable(z);
    }

    /* renamed from: b */
    public final void mo15761b(Object obj) {
        int i = Build.VERSION.SDK_INT;
        this.f26877a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((C1300ql) obj).f26876a);
    }

    /* renamed from: c */
    public final void mo15767c(boolean z) {
        this.f26877a.setFocusable(z);
    }

    /* renamed from: d */
    public final void mo15771d(boolean z) {
        this.f26877a.setFocused(z);
    }

    /* renamed from: e */
    public final boolean mo15775e() {
        return this.f26877a.isPassword();
    }

    /* renamed from: a */
    public static C1301qm m20016a() {
        return m20017a(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: b */
    public final void mo15762b(C1298qj qjVar) {
        int i = Build.VERSION.SDK_INT;
        this.f26877a.removeAction((AccessibilityNodeInfo.AccessibilityAction) qjVar.f26871l);
    }

    /* renamed from: c */
    public final boolean mo15768c() {
        return this.f26877a.isFocusable();
    }

    /* renamed from: d */
    public final boolean mo15772d() {
        return this.f26877a.isEnabled();
    }

    /* renamed from: a */
    public static C1301qm m20017a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C1301qm(accessibilityNodeInfo);
    }

    /* renamed from: b */
    public final void mo15763b(boolean z) {
        this.f26877a.setChecked(z);
    }

    /* renamed from: a */
    public final void mo15752a(int i) {
        this.f26877a.addAction(i);
    }

    /* renamed from: b */
    public final boolean mo15764b() {
        return this.f26877a.isChecked();
    }

    @Deprecated
    /* renamed from: a */
    public final void mo15753a(Rect rect) {
        this.f26877a.getBoundsInParent(rect);
    }

    /* renamed from: h */
    public final void mo15782h(boolean z) {
        this.f26877a.setScrollable(z);
    }

    /* renamed from: a */
    public final void mo15754a(View view) {
        this.f26878b = -1;
        this.f26877a.setParent(view);
    }

    /* renamed from: a */
    public final void mo15755a(CharSequence charSequence) {
        this.f26877a.setClassName(charSequence);
    }

    /* renamed from: a */
    public final void mo15756a(Object obj) {
        int i = Build.VERSION.SDK_INT;
        this.f26877a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) (obj != null ? ((C1299qk) obj).f26875a : null));
    }

    /* renamed from: a */
    public final void mo15757a(C1298qj qjVar) {
        int i = Build.VERSION.SDK_INT;
        this.f26877a.addAction((AccessibilityNodeInfo.AccessibilityAction) qjVar.f26871l);
    }

    /* renamed from: a */
    public final void mo15758a(boolean z) {
        this.f26877a.setCheckable(z);
    }
}
