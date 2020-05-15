package p000;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;

/* renamed from: ju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1118ju {

    /* renamed from: a */
    public final String f23213a;

    /* renamed from: b */
    public final CharSequence f23214b;

    /* renamed from: c */
    public final CharSequence[] f23215c;

    /* renamed from: d */
    public final boolean f23216d = true;

    /* renamed from: e */
    public final Bundle f23217e;

    /* renamed from: f */
    public final Set f23218f;

    public C1118ju(String str, CharSequence charSequence, CharSequence[] charSequenceArr, Bundle bundle, Set set) {
        this.f23213a = str;
        this.f23214b = charSequence;
        this.f23215c = charSequenceArr;
        this.f23217e = bundle;
        this.f23218f = set;
    }

    /* renamed from: a */
    static RemoteInput[] m17342a(C1118ju[] juVarArr) {
        RemoteInput[] remoteInputArr = new RemoteInput[juVarArr.length];
        for (int i = 0; i < juVarArr.length; i++) {
            C1118ju juVar = juVarArr[i];
            RemoteInput.Builder choices = new RemoteInput.Builder(juVar.f23213a).setLabel(juVar.f23214b).setChoices(juVar.f23215c);
            boolean z = juVar.f23216d;
            RemoteInput.Builder addExtras = choices.setAllowFreeFormInput(true).addExtras(juVar.f23217e);
            int i2 = Build.VERSION.SDK_INT;
            addExtras.setEditChoicesBeforeSending(0);
            remoteInputArr[i] = addExtras.build();
        }
        return remoteInputArr;
    }
}
