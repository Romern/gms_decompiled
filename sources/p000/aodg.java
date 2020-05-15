package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.FieldMappingDictionary;

/* renamed from: aodg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aodg extends shd {

    /* renamed from: a */
    public final shj f78218a;

    public aodg(shj shj) {
        this.f78218a = shj;
        shj.f44447g = 6400;
    }

    /* renamed from: b */
    public static String m65827b(String str) {
        return String.format("people/%1$s", shd.m35267a(str));
    }

    /* renamed from: a */
    public final sio mo42546a(ClientContext clientContext, String str, Class cls, FieldMappingDictionary fieldMappingDictionary) {
        return this.f78218a.mo25537a(clientContext, 0, m65827b(str), (Object) null, cls, fieldMappingDictionary);
    }
}
