package p000;

import android.app.assist.AssistStructure;
import android.os.Build;
import android.util.Pair;
import android.view.ViewStructure;
import java.util.Iterator;
import java.util.List;

/* renamed from: kof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kof {
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0.f24590o = java.lang.Integer.parseInt((java.lang.String) r3.second);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0139, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0146 A[LOOP:2: B:34:0x0140->B:36:0x0146, LOOP_END] */
    /* renamed from: a */
    public static koj m18242a(AssistStructure.ViewNode viewNode) {
        int i;
        bngx bngx;
        List<Pair<String, String>> attributes;
        koj koj = new koj();
        koj.f24576a = viewNode.getClassName();
        koj.f24577b = viewNode.getIdEntry();
        koj.f24578c = viewNode.getInputType();
        koj.f24593r = viewNode.isClickable();
        koj.f24579d = viewNode.getHint();
        String str = "";
        koj.f24580e = viewNode.getText() != null ? viewNode.getText().toString() : str;
        koj.f24583h = viewNode.getVisibility();
        koj.f24581f = viewNode.getAutofillType();
        koj.mo14751a(viewNode.getAutofillOptions());
        koj.f24582g = viewNode.getAutofillId();
        koj.mo14752a(viewNode.getAutofillHints());
        koj.f24584i = viewNode.getLeft();
        koj.f24585j = viewNode.getTop();
        koj.f24587l = viewNode.getWidth();
        koj.f24586k = viewNode.getHeight();
        koj.f24588m = viewNode.getScrollX();
        koj.f24589n = viewNode.getScrollY();
        koj.f24592q = viewNode.isFocused();
        koj.f24594s = viewNode.getWebDomain();
        if (viewNode.getContentDescription() != null) {
            str = viewNode.getContentDescription().toString();
        }
        koj.f24591p = str;
        int i2 = Build.VERSION.SDK_INT;
        koj.f24590o = viewNode.getMaxTextLength();
        koj.mo14750a(viewNode.getImportantForAutofill());
        if (viewNode.getHtmlInfo() != null) {
            ViewStructure.HtmlInfo htmlInfo = viewNode.getHtmlInfo();
            List<Pair<String, String>> attributes2 = htmlInfo.getAttributes();
            if (attributes2 == null) {
                bngx = bngx.m109376e();
            } else {
                bngs b = bngx.m109371b(attributes2.size());
                for (Pair<String, String> pair : attributes2) {
                    b.mo67668c(kok.m18253a(bmxx.m108578b((String) pair.first), bmxx.m108578b((String) pair.second)));
                }
                bngx = b.mo67664a();
            }
            koj.f24595t = kol.m18256a(bmxx.m108578b(htmlInfo.getTag()), bngx);
            int i3 = Build.VERSION.SDK_INT;
            if (viewNode.getMaxTextLength() == -1 && (attributes = htmlInfo.getAttributes()) != null) {
                Iterator<Pair<String, String>> it = attributes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Pair<String, String> next = it.next();
                    if (next.first != null && bmwb.m108443a((CharSequence) next.first, "maxlength")) {
                        try {
                            break;
                        } catch (NumberFormatException e) {
                        }
                    }
                }
                while (i < viewNode.getChildCount()) {
                    koj.mo14753a(m18242a(viewNode.getChildAt(i)));
                    i++;
                }
                return koj;
            }
            i = 0;
            while (i < viewNode.getChildCount()) {
            }
            return koj;
        }
        i = 0;
        while (i < viewNode.getChildCount()) {
        }
        return koj;
    }
}
