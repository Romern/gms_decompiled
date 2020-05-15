package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeRequest;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: almf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class almf extends aaab {

    /* renamed from: a */
    private final ClientContext f73677a;

    /* renamed from: b */
    private final List f73678b;

    /* renamed from: c */
    private final alss f73679c;

    /* renamed from: d */
    private final almc f73680d;

    /* renamed from: e */
    private final almk f73681e;

    /* renamed from: f */
    private final String f73682f;

    /* renamed from: g */
    private final int f73683g;

    public almf(Context context, ClientContext clientContext, List list, alss alss, almc almc, almk almk, String str) {
        super(5, "ClassifyAccountTypes");
        this.f73677a = clientContext;
        this.f73678b = list;
        this.f73679c = alss;
        this.f73680d = almc;
        this.f73681e = almk;
        int a = C1145kt.m18541a(context, "android.permission.READ_CONTACTS", clientContext.f30220j, clientContext.f30212b, clientContext.f30215e);
        ClientContext clientContext2 = this.f73677a;
        int a2 = C1145kt.m18541a(context, "android.permission.GET_ACCOUNTS", clientContext2.f30220j, clientContext2.f30212b, clientContext2.f30215e);
        if (a == -1 || a2 == -1) {
            throw new SecurityException("Missing required permissions. READ_CONTACTS and GET_ACCOUNTS are required.");
        }
        int i = -2;
        if (!(a == -2 || a2 == -2)) {
            i = 0;
        }
        this.f73683g = i;
        this.f73682f = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        Status status;
        ClassifyAccountTypeResult classifyAccountTypeResult;
        int a = anby.m63961a(this.f73677a.f30215e, this.f73682f);
        bxvd da = amkw.f75120e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amkw amkw = (amkw) da.f164949b;
        amkw.f75123b = 7;
        int i = amkw.f75122a | 1;
        amkw.f75122a = i;
        int i2 = a - 1;
        if (a != 0) {
            amkw.f75125d = i2;
            amkw.f75122a = i | 4;
            if (cfum.m143092c() && this.f73683g == 0 && cfum.f185736a.mo6606a().mo82745b().f165797a.contains(this.f73677a.f30215e)) {
                try {
                    almc almc = this.f73680d;
                    allx b = cfum.m143091b();
                    bxvd bxvd = (bxvd) b.mo74142c(5);
                    bxvd.mo73625a((bxvk) b);
                    bxvd.mo73625a((bxvk) almc.mo40497a());
                    almg almg = new almg((allx) bxvd.mo74062i());
                    ArrayList arrayList = new ArrayList(this.f73678b.size());
                    for (ClassifyAccountTypeRequest classifyAccountTypeRequest : this.f73678b) {
                        if (TextUtils.isEmpty(classifyAccountTypeRequest.f81694a)) {
                            classifyAccountTypeResult = almg.mo40506a(null, classifyAccountTypeRequest.f81695b);
                        } else {
                            classifyAccountTypeResult = almg.mo40506a(classifyAccountTypeRequest.f81694a, classifyAccountTypeRequest.f81695b);
                        }
                        arrayList.add(classifyAccountTypeResult);
                    }
                    this.f73679c.mo40724a(Status.f30107a, arrayList);
                    status = Status.f30107a;
                } catch (IOException e) {
                    this.f73679c.mo40724a(Status.f30109c, bngx.m109376e());
                    status = Status.f30109c;
                }
            } else {
                status = Status.f30112f;
                this.f73679c.mo40724a(status, bngx.m109376e());
            }
            if (status.mo17710c()) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                amkw amkw2 = (amkw) da.f164949b;
                amkw2.f75124c = 1;
                amkw2.f75122a |= 2;
            } else if (status.f30115i != 17) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                amkw amkw3 = (amkw) da.f164949b;
                amkw3.f75124c = 0;
                amkw3.f75122a |= 2;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                amkw amkw4 = (amkw) da.f164949b;
                amkw4.f75124c = 4;
                amkw4.f75122a |= 2;
            }
            this.f73681e.mo40515a((amkw) da.mo74062i());
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f73679c.mo40724a(status, bngx.m109376e());
    }
}
