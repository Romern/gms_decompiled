package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: apsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apsd extends aplq {

    /* renamed from: a */
    private final abrv f84813a;

    /* renamed from: b */
    private final Bundle f84814b;

    public apsd(abrv abrv, Bundle bundle, abyy abyy) {
        super(bqbd.LOG_API_TRACE_EVENTS, 1, 1, abrv.f58066b, bundle, abyy);
        this.f84813a = abrv;
        this.f84814b = bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        Bundle bundle = this.f84814b;
        if (bundle != null && bundle.containsKey("should_log_stats")) {
            byte[] byteArray = this.f84814b.getByteArray("IcingQueryStatsLog");
            if (byteArray != null) {
                try {
                    bxvd da = bpxd.f139655C.mo74144da();
                    da.mo73635b(byteArray, bxus.m123744c());
                    int i = (int) (this.f84814b.getLong("response_timestamp_ms") - this.f84814b.getLong("query_task_done_timestamp_ms"));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpxd bpxd = (bpxd) da.f164949b;
                    bpxd.f139659a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                    bpxd.f139678t = i;
                    Object[] objArr = new Object[12];
                    bpzh a = bpzh.m112427a(bpxd.f139660b);
                    if (a == null) {
                        a = bpzh.QUERY;
                    }
                    objArr[0] = a;
                    objArr[1] = Integer.valueOf(((bpxd) da.f164949b).f139666h);
                    objArr[2] = Integer.valueOf(((bpxd) da.f164949b).f139667i);
                    objArr[3] = Integer.valueOf(((bpxd) da.f164949b).f139668j);
                    objArr[4] = Integer.valueOf(((bpxd) da.f164949b).f139677s);
                    objArr[5] = Integer.valueOf(((bpxd) da.f164949b).f139671m);
                    objArr[6] = Integer.valueOf(((bpxd) da.f164949b).f139672n);
                    objArr[7] = Integer.valueOf(((bpxd) da.f164949b).f139674p);
                    objArr[8] = Integer.valueOf(((bpxd) da.f164949b).f139675q);
                    objArr[9] = Integer.valueOf(((bpxd) da.f164949b).f139676r);
                    objArr[10] = Integer.valueOf(((bpxd) da.f164949b).f139678t);
                    bpxd bpxd2 = (bpxd) da.f164949b;
                    objArr[11] = Integer.valueOf(bpxd2.f139677s + bpxd2.f139671m + bpxd2.f139673o + bpxd2.f139676r + bpxd2.f139678t);
                    absg.m48194b("%s req/res/sco %d/%d/%d in before_init:%d init:%d + lock_wait:%d + prepBefore:%d  + prepAfter:%d +  execute:%d + after_query_task:%d = %d ms", objArr);
                    this.f84813a.f58083s.mo32441a((bpxd) da.mo74062i());
                    return Status.f30107a;
                } catch (bxwf e) {
                    absg.m48189a(e, "Can't deserialize the Query Log proto.");
                    return Status.f30109c;
                }
            } else {
                absg.m48191b("Can't find query log from log events.");
                return Status.f30109c;
            }
        } else {
            absg.m48191b("LogApiTraceEvents is called when there is nothing to log.");
            return Status.f30109c;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        return status;
    }
}
