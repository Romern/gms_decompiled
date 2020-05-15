package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: abxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abxj extends abwz {

    /* renamed from: a */
    public boolean f58676a;

    /* renamed from: b */
    private final ActionImpl f58677b;

    /* renamed from: c */
    private final String f58678c;

    /* renamed from: d */
    private final String f58679d;

    /* renamed from: e */
    private acxo f58680e;

    /* renamed from: f */
    private abww f58681f;

    /* renamed from: g */
    private Thing f58682g;

    public abxj(ActionImpl actionImpl, String str, String str2) {
        super(0);
        this.f58677b = actionImpl;
        this.f58678c = str;
        this.f58679d = str2;
    }

    /* renamed from: a */
    public final void mo32405a(abrv abrv, abyy abyy, abvx abvx) {
        sdo.checkIfNull(this.f58681f, "execute called without validateInput");
        abvr.m48357a(abrv, abyy, this.f58681f);
        caef b = abyd.m48530b(this.f58682g);
        bxvd da = abqq.f58001c.mo74144da();
        bxvd da2 = abqu.f58016d.mo74144da();
        String str = this.f58681f.f58662b;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        str.getClass();
        ((abqu) da2.f164949b).f58018a = str;
        String b2 = this.f58681f.mo32395b();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        abqu abqu = (abqu) da2.f164949b;
        b2.getClass();
        abqu.f58019b = b2;
        b.getClass();
        abqu.f58020c = b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abqq abqq = (abqq) da.f164949b;
        abqu abqu2 = (abqu) da2.mo74062i();
        abqu2.getClass();
        abqq.f58004b = abqu2;
        abqq.f58003a = 6;
        abvx.mo32374a((abqq) da.mo74062i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32401a(abyy abyy, abrv abrv) {
    }

    /* renamed from: a */
    public final void mo32400a(abvo abvo, abyy abyy, abrv abrv) {
        if (this.f58676a) {
            abrv.f58067c.mo32995d(new abva(abrv, false, false));
            abrv.f58083s.mo32453b(16004);
            this.f58676a = false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a3  */
    /* renamed from: a */
    public final void mo32406a(abyy abyy, abrv abrv, abxt abxt) {
        char c;
        ActionImpl actionImpl = this.f58677b;
        if (actionImpl.f152343c != null) {
            acxo acxo = abrv.f58075k;
            this.f58680e = acxo;
            if (acxo == null) {
                throw new abws("Internal error", actionImpl, bpzq.INTERNAL_ERROR);
            } else if (cemw.f183016a.mo6606a().mo79375e()) {
                try {
                    ActionImpl actionImpl2 = this.f58677b;
                    ActionImpl.MetadataImpl metadataImpl = actionImpl2.f152345e;
                    if (metadataImpl != null) {
                        if (metadataImpl.f152353f) {
                            throw new brho("Cannot convert context-only Action to Indexable");
                        }
                    }
                    bric bric = new bric("Action");
                    bric.mo69558c(actionImpl2.f152342b);
                    bric.mo69557b(actionImpl2.f152343c);
                    bric.mo69553a("additionalType", actionImpl2.f152341a);
                    String str = actionImpl2.f152344d;
                    if (str != null) {
                        sdo.m34959a((Object) str);
                        bric.mo69553a("sameAs", str);
                    }
                    String str2 = actionImpl2.f152346f;
                    String str3 = null;
                    if (str2 != null) {
                        int hashCode = str2.hashCode();
                        if (hashCode != -2130832917) {
                            if (hashCode != -580380876) {
                                if (hashCode == 1575353005 && str2.equals("http://schema.org/CompletedActionStatus")) {
                                    c = 1;
                                    if (c != 0) {
                                        str3 = "ActiveActionStatus";
                                    } else if (c == 1) {
                                        str3 = "CompletedActionStatus";
                                    } else if (c == 2) {
                                        str3 = "FailedActionStatus";
                                    }
                                }
                            } else if (str2.equals("http://schema.org/ActiveActionStatus")) {
                                c = 0;
                                if (c != 0) {
                                }
                            }
                        } else if (str2.equals("http://schema.org/FailedActionStatus")) {
                            c = 2;
                            if (c != 0) {
                            }
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                    }
                    if (str3 != null) {
                        if (!"ActiveActionStatus".equals(str3)) {
                            if (!"CompletedActionStatus".equals(str3) && !"FailedActionStatus".equals(str3)) {
                                throw new IllegalArgumentException(str3.length() == 0 ? new String("Invalid action status ") : "Invalid action status ".concat(str3));
                            }
                        }
                        bric.mo69553a("actionStatus", str3);
                    }
                    Bundle bundle = actionImpl2.f152347g;
                    for (String str4 : bundle.keySet()) {
                        Object obj = bundle.get(str4);
                        if (obj instanceof long[]) {
                            bric.mo69551a(str4, (long[]) obj);
                        } else if (obj instanceof boolean[]) {
                            bric.mo69554a(str4, (boolean[]) obj);
                        } else if (obj instanceof String[]) {
                            bric.mo69553a(str4, (String[]) obj);
                        } else if (obj instanceof brhy[]) {
                            brhy[] brhyArr = (brhy[]) obj;
                            Bundle bundle2 = bric.f142860a;
                            sdo.m34959a((Object) str4);
                            sdo.m34959a(brhyArr);
                            Thing[] thingArr = new Thing[brhyArr.length];
                            for (int i = 0; i < brhyArr.length; i++) {
                                brhy brhy = brhyArr[i];
                                if (brhy != null) {
                                    if (!(brhy instanceof Thing)) {
                                        throw new brho("Invalid Indexable encountered. Use Indexable.Builder or convenience methods under Indexables to create the Indexable.");
                                    }
                                }
                                thingArr[i] = (Thing) brhy;
                            }
                            bric.m114029a(bundle2, str4, thingArr);
                        } else if (obj instanceof double[]) {
                            double[] dArr = (double[]) obj;
                            Bundle bundle3 = bric.f142860a;
                            sdo.m34959a((Object) str4);
                            sdo.m34959a(dArr);
                            int length = dArr.length;
                            if (length <= 0) {
                                briy.m114097a("Double array is empty and is ignored by put method.");
                            } else {
                                if (length >= 100) {
                                    briy.m114097a("Input Array of elements is too big, cutting off.");
                                    dArr = Arrays.copyOf(dArr, 100);
                                }
                                bundle3.putDoubleArray(str4, dArr);
                            }
                        }
                    }
                    if (metadataImpl != null) {
                        brhx brhx = new brhx();
                        bric.mo69551a("eventStatus", (long) metadataImpl.f152348a);
                        if (!TextUtils.isEmpty(metadataImpl.f152351d)) {
                            String str5 = metadataImpl.f152351d;
                            sdo.m34959a((Object) str5);
                            sdo.m34969a(str5, (Object) "accountEmail must not be an empty string");
                            brhx.f142856a = str5;
                        }
                        String str6 = metadataImpl.f152350c;
                        if (str6 != null) {
                            bric.mo69553a("completionToken", str6);
                        }
                        byte[] bArr = metadataImpl.f152352e;
                        if (bArr != null) {
                            sdo.m34959a((Object) "ssbContext");
                            sdo.m34959a(bArr);
                            bric.f142860a.putByteArray("ssbContext", bArr);
                        }
                        if (metadataImpl.f152349b) {
                            StringBuilder sb = new StringBuilder(69);
                            sb.append("The scope of this indexable is not valid, scope value is ");
                            sb.append(3);
                            sb.append(".");
                            sdo.m34975b(brib.m114025a(3), sb.toString());
                            bric.m114028a(brhx.f142857b, "scope", 3);
                        }
                        bric.mo69548a(brhx);
                    }
                    Thing thing = (Thing) bric.mo69547a();
                    this.f58682g = thing;
                    this.f58681f = abwx.m48420a(thing, abyy.f58780f, abxt);
                } catch (brho e) {
                    throw new abws(bpzo.ACTION_START, "Internal error happened in ActionIndexableConverter", this.f58677b, bpzq.INTERNAL_ERROR, e);
                }
            }
        } else {
            throw new abws("Action.objectUrl cannot be null", actionImpl, bpzq.INVALID_ARGUMENT_NULL);
        }
    }

    /* renamed from: a */
    public final void mo32403a(Context context, SQLiteDatabase sQLiteDatabase, abvo abvo, abyy abyy, abxt abxt) {
        UsageInfo usageInfo;
        sdo.checkIfNull(this.f58680e, "executeOnDb called without successful validateInput");
        long currentTimeMillis = System.currentTimeMillis();
        String a = acxb.m49919a(this.f58677b.f152343c);
        if ("com.google.android.gms".equals(this.f58679d) && a != null) {
            usageInfo = abye.m48534b(this.f58677b, currentTimeMillis, a);
        } else {
            usageInfo = abye.m48532a(this.f58677b, currentTimeMillis, this.f58678c);
        }
        UsageInfo[] usageInfoArr = {usageInfo};
        if (this.f58680e.mo33213a(usageInfoArr, this.f58678c, currentTimeMillis, acxm.m49954a(context, currentTimeMillis), new abxi(this))) {
            absg.m48185a("UserActionNotificationResult: %s", acrj.m49738a(context, this.f58678c, usageInfoArr, rfz.m33557a(context)));
            acwl.m49905a(context, this.f58678c, usageInfoArr, "FirebaseUserActions");
            abxp.m48475a(context).mo32416a(this.f58678c, this.f58677b);
            return;
        }
        throw new IOException("Failed to log UsageInfo");
    }
}
