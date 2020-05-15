package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.InflateException;
import com.google.android.setupdesign.items.Item;
import java.lang.reflect.Constructor;
import java.util.HashMap;

/* renamed from: bizw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bizw extends bizx {

    /* renamed from: c */
    private static final Class[] f122398c = {Context.class, AttributeSet.class};

    /* renamed from: d */
    private static final HashMap f122399d = new HashMap();

    /* renamed from: a */
    public final String f122400a;

    /* renamed from: e */
    private final Object[] f122401e = new Object[2];

    /* renamed from: f */
    private final Context f122402f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo64927a(String str, AttributeSet attributeSet) {
        String str2 = this.f122400a;
        String concat = (str2 == null || str.indexOf(46) != -1) ? str : str2.concat(str);
        Constructor<?> constructor = (Constructor) f122399d.get(concat);
        if (constructor == null) {
            try {
                constructor = this.f122402f.getClassLoader().loadClass(concat).getConstructor(f122398c);
                constructor.setAccessible(true);
                f122399d.put(str, constructor);
            } catch (Exception e) {
                String positionDescription = attributeSet.getPositionDescription();
                StringBuilder sb = new StringBuilder(String.valueOf(positionDescription).length() + 24 + String.valueOf(concat).length());
                sb.append(positionDescription);
                sb.append(": Error inflating class ");
                sb.append(concat);
                throw new InflateException(sb.toString(), e);
            }
        }
        Object[] objArr = this.f122401e;
        objArr[0] = this.f122402f;
        objArr[1] = attributeSet;
        Object newInstance = constructor.newInstance(objArr);
        Object[] objArr2 = this.f122401e;
        objArr2[0] = null;
        objArr2[1] = null;
        return newInstance;
    }

    public bizw(Context context) {
        super(context.getResources());
        this.f122402f = context;
        this.f122400a = String.valueOf(Item.class.getPackage().getName()).concat(".");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64928a(Object obj, Object obj2) {
        bizp bizp = (bizp) obj;
        bizp bizp2 = (bizp) obj2;
        if (bizp instanceof bizq) {
            ((bizq) bizp).mo58966a(bizp2);
            return;
        }
        String valueOf = String.valueOf(bizp);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Cannot add child item to ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
