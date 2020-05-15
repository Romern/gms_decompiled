package p000;

import android.app.assist.AssistStructure;
import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.fill.FillField;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: kzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kzc {
    /* renamed from: a */
    public static bnhe m18813a(lgv lgv, Collection collection) {
        int i;
        bnha h = bnhe.m109414h();
        bnhp b = bnht.m109442b();
        collection.stream().forEach(new kzb(b));
        bnht c = b.mo67731c();
        bnre i2 = lgv.f26062a.mo67670d().listIterator();
        while (i2.hasNext()) {
            AssistStructure assistStructure = (AssistStructure) i2.next();
            int a = lgv.mo15068a(assistStructure);
            if (a != -1) {
                HashSet a2 = bnpf.m110049a(c.mo67692g(Integer.valueOf(a)));
                bnha h2 = bnhe.m109414h();
                ArrayDeque arrayDeque = new ArrayDeque();
                for (int i3 = 0; i3 < assistStructure.getWindowNodeCount(); i3++) {
                    AssistStructure.WindowNode windowNodeAt = assistStructure.getWindowNodeAt(i3);
                    if (windowNodeAt.getRootViewNode() != null) {
                        arrayDeque.add(windowNodeAt.getRootViewNode());
                    }
                }
                while (!arrayDeque.isEmpty() && !a2.isEmpty()) {
                    AssistStructure.ViewNode viewNode = (AssistStructure.ViewNode) arrayDeque.poll();
                    if (viewNode != null) {
                        AutofillId autofillId = viewNode.getAutofillId();
                        FillField fillField = null;
                        if (autofillId != null) {
                            Iterator it = a2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                FillField fillField2 = (FillField) it.next();
                                if (fillField2.f11631a.equals(autofillId)) {
                                    fillField = fillField2;
                                    break;
                                }
                            }
                        }
                        if (fillField != null) {
                            a2.remove(fillField);
                            h2.mo67695b(fillField, viewNode);
                            i = 0;
                        } else {
                            i = 0;
                        }
                        while (i < viewNode.getChildCount()) {
                            arrayDeque.add(viewNode.getChildAt(i));
                            i++;
                        }
                    }
                }
                h.mo67694a(h2.mo67618b());
            }
        }
        return h.mo67618b();
    }
}
