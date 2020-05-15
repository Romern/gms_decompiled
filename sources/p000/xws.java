package p000;

import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import java.util.Set;

/* renamed from: xws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface xws extends xwg {

    /* renamed from: i */
    public static final xwq f53305i = new xwq();

    /* renamed from: a */
    void mo30198a(xwj xwj, int i, String str);

    /* renamed from: a */
    void mo30199a(xwj xwj, Transport transport);

    /* renamed from: a */
    void mo30200a(xwj xwj, SignResponseData signResponseData, Transport transport);

    /* renamed from: a */
    void mo30201a(xwj xwj, String str, RegisterRequestParams registerRequestParams, Set set);

    /* renamed from: a */
    void mo30202a(xwj xwj, String str, SignRequestParams signRequestParams, Set set);

    /* renamed from: a */
    void mo30203a(xwj xwj, xle xle);

    /* renamed from: a */
    void mo30204a(xwj xwj, xlf xlf);
}
