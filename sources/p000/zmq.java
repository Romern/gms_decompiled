package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.result.DataTypeResult;
import java.io.IOException;

/* renamed from: zmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zmq {

    /* renamed from: a */
    public static final srn f55482a = zvt.m46581a();

    /* renamed from: b */
    public static final Status f55483b = new Status(0);

    /* renamed from: c */
    public final ysl f55484c;

    /* renamed from: d */
    public final zri f55485d;

    public zmq(ysl ysl, zri zri) {
        this.f55484c = ysl;
        this.f55485d = zri;
    }

    /* renamed from: a */
    public final DataTypeResult mo31259a(caah caah) {
        try {
            this.f55485d.mo31381a(caah);
            return new DataTypeResult(f55483b, ywb.m44931a(caah));
        } catch (zrh e) {
            return new DataTypeResult(ysl.f54547d, ywb.m44931a(e.f55743a));
        } catch (IOException e2) {
            return new DataTypeResult(new Status(5008), null);
        }
    }

    /* renamed from: a */
    public final DataTypeResult mo31260a(DataTypeReadRequest dataTypeReadRequest, String str) {
        String str2 = dataTypeReadRequest.f32242a;
        if (!this.f55484c.mo30723a(str, str2, 1)) {
            bnsl bnsl = (bnsl) f55482a.mo68388c();
            bnsl.mo68432a("zmq", "a", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("App %s does not have access to data type %s", str, str2);
            return new DataTypeResult(ysl.f54548e, null);
        }
        caah b = this.f55485d.mo31383b(str2);
        if (b != null) {
            return new DataTypeResult(f55483b, ywb.m44931a(b));
        }
        bnsl bnsl2 = (bnsl) f55482a.mo68388c();
        bnsl2.mo68432a("zmq", "a", 81, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("No datatype %s found. Checking if this is a shareable one.", str2);
        caah b2 = this.f55484c.mo30724b(str2);
        if (b2 == null) {
            return new DataTypeResult(ysl.f54550g, null);
        }
        bnsl bnsl3 = (bnsl) f55482a.mo68388c();
        bnsl3.mo68432a("zmq", "a", 88, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68420a("Adding shareable data type: %s", str2);
        return mo31259a(b2);
    }
}
