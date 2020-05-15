package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: atev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atev extends LayoutInflater {

    /* renamed from: a */
    final /* synthetic */ atew f90207a;

    /* renamed from: b */
    private final String[] f90208b = {"android.widget.", "android.webkit."};

    /* renamed from: c */
    private final LayoutInflater f90209c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public atev(atew atew, LayoutInflater layoutInflater) {
        super(layoutInflater.getContext());
        this.f90207a = atew;
        this.f90209c = layoutInflater;
    }

    public final LayoutInflater cloneInContext(Context context) {
        return new atev(this.f90207a, this.f90209c.cloneInContext(context));
    }

    /* access modifiers changed from: protected */
    public final View onCreateView(String str, AttributeSet attributeSet) {
        String[] strArr = this.f90208b;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                View createView = createView(str, strArr[i], attributeSet);
                if (createView != null) {
                    return createView;
                }
                i++;
            } catch (ClassNotFoundException e) {
            }
        }
        return super.onCreateView(str, attributeSet);
    }
}
