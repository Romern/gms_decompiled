package p000;

import android.content.Context;
import android.widget.SectionIndexer;
import java.util.ArrayList;

/* renamed from: aonr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aonr extends aont implements SectionIndexer {

    /* renamed from: a */
    private aonq[] f78588a = new aonq[0];

    public aonr(Context context) {
        super(context);
    }

    public final int getPositionForSection(int i) {
        aonq[] aonqArr = this.f78588a;
        if (i < aonqArr.length) {
            return aonqArr[i].f78586a;
        }
        return 0;
    }

    public final int getSectionForPosition(int i) {
        int i2 = 1;
        while (true) {
            aonq[] aonqArr = this.f78588a;
            if (i2 >= aonqArr.length) {
                return 0;
            }
            if (aonqArr[i2].f78586a > i) {
                return i2 - 1;
            }
            i2++;
        }
    }

    public final Object[] getSections() {
        return this.f78588a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo43101h() {
        ArrayList arrayList = new ArrayList();
        this.f78592P.mo43094a(arrayList, 0);
        this.f78588a = (aonq[]) arrayList.toArray(new aonq[arrayList.size()]);
    }
}
