package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.InflateException;
import com.android.setupwizardlib.items.Item;
import java.lang.reflect.Constructor;
import java.util.HashMap;

@Deprecated
/* renamed from: bmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmj extends bmk {

    /* renamed from: c */
    private static final Class[] f5161c = {Context.class, AttributeSet.class};

    /* renamed from: d */
    private static final HashMap f5162d = new HashMap();

    /* renamed from: a */
    public final String f5163a;

    /* renamed from: e */
    private final Object[] f5164e = new Object[2];

    /* renamed from: f */
    private final Context f5165f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3277a(String str, AttributeSet attributeSet) {
        String str2 = this.f5163a;
        String concat = (str2 == null || str.indexOf(46) != -1) ? str : str2.concat(str);
        Constructor<?> constructor = (Constructor) f5162d.get(concat);
        if (constructor == null) {
            try {
                constructor = this.f5165f.getClassLoader().loadClass(concat).getConstructor(f5161c);
                constructor.setAccessible(true);
                f5162d.put(str, constructor);
            } catch (Exception e) {
                String positionDescription = attributeSet.getPositionDescription();
                StringBuilder sb = new StringBuilder(String.valueOf(positionDescription).length() + 24 + String.valueOf(concat).length());
                sb.append(positionDescription);
                sb.append(": Error inflating class ");
                sb.append(concat);
                throw new InflateException(sb.toString(), e);
            }
        }
        Object[] objArr = this.f5164e;
        objArr[0] = this.f5165f;
        objArr[1] = attributeSet;
        Object newInstance = constructor.newInstance(objArr);
        Object[] objArr2 = this.f5164e;
        objArr2[0] = null;
        objArr2[1] = null;
        return newInstance;
    }

    public bmj(Context context) {
        super(context.getResources());
        this.f5165f = context;
        this.f5163a = String.valueOf(Item.class.getPackage().getName()).concat(".");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3278a(Object obj, Object obj2) {
        bmd bmd = (bmd) obj;
        bmd bmd2 = (bmd) obj2;
        if (bmd instanceof bme) {
            ((bme) bmd).mo3273a(bmd2);
            return;
        }
        String valueOf = String.valueOf(bmd);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Cannot add child item to ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
