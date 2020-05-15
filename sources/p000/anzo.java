package p000;

import android.app.Dialog;
import android.os.Bundle;

/* renamed from: anzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anzo extends anxx {

    /* renamed from: a */
    private String f77938a;

    /* renamed from: b */
    private String f77939b;

    /* renamed from: c */
    private String f77940c;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f77938a = arguments.getString("secureUrl");
        this.f77939b = arguments.getString("prettyUrl");
        this.f77940c = arguments.getString("title");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new anzn(getActivity(), this.f77938a, this.f77939b, this.f77940c);
    }
}
