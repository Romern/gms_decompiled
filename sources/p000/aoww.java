package p000;

import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.model.Address;
import com.google.android.gms.reminders.model.CategoryInfo;
import com.google.android.gms.reminders.model.ChainInfo;
import com.google.android.gms.reminders.model.DailyPattern;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.ExternalApplicationLink;
import com.google.android.gms.reminders.model.FeatureIdProto;
import com.google.android.gms.reminders.model.Location;
import com.google.android.gms.reminders.model.LocationGroup;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEnd;
import com.google.android.gms.reminders.model.RecurrenceInfo;
import com.google.android.gms.reminders.model.RecurrenceStart;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskId;
import com.google.android.gms.reminders.model.Time;
import com.google.android.gms.reminders.model.WeeklyPattern;
import com.google.android.gms.reminders.model.YearlyPattern;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: aoww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoww {
    /* renamed from: a */
    private static blnj m69739a(Address address) {
        if (address == null) {
            return null;
        }
        bxvd da = blnj.f126981j.mo74144da();
        if (!TextUtils.isEmpty(address.mo58606c())) {
            String c = address.mo58606c();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnj blnj = (blnj) da.f164949b;
            c.getClass();
            blnj.f126983a |= 1;
            blnj.f126984b = c;
        }
        if (!TextUtils.isEmpty(address.mo58607d())) {
            String d = address.mo58607d();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnj blnj2 = (blnj) da.f164949b;
            d.getClass();
            blnj2.f126983a |= 2;
            blnj2.f126985c = d;
        }
        if (!TextUtils.isEmpty(address.mo58609f())) {
            String f = address.mo58609f();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnj blnj3 = (blnj) da.f164949b;
            f.getClass();
            blnj3.f126983a |= 4;
            blnj3.f126986d = f;
        }
        if (!TextUtils.isEmpty(address.mo58610g())) {
            String g = address.mo58610g();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnj blnj4 = (blnj) da.f164949b;
            g.getClass();
            blnj4.f126983a |= 8;
            blnj4.f126987e = g;
        }
        if (!TextUtils.isEmpty(address.mo58611h())) {
            String h = address.mo58611h();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnj blnj5 = (blnj) da.f164949b;
            h.getClass();
            blnj5.f126983a |= 16;
            blnj5.f126988f = h;
        }
        if (!TextUtils.isEmpty(address.mo58612i())) {
            String i = address.mo58612i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnj blnj6 = (blnj) da.f164949b;
            i.getClass();
            blnj6.f126983a |= 32;
            blnj6.f126989g = i;
        }
        if (!TextUtils.isEmpty(address.mo58613j())) {
            String j = address.mo58613j();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnj blnj7 = (blnj) da.f164949b;
            j.getClass();
            blnj7.f126983a |= 64;
            blnj7.f126990h = j;
        }
        if (!TextUtils.isEmpty(address.mo58614k())) {
            String k = address.mo58614k();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnj blnj8 = (blnj) da.f164949b;
            k.getClass();
            blnj8.f126983a |= 128;
            blnj8.f126991i = k;
        }
        return (blnj) da.mo74062i();
    }

    /* renamed from: b */
    public static long m69748b(UpdateRecurrenceOptions updateRecurrenceOptions) {
        Long l = updateRecurrenceOptions.f107055c;
        if (l != null) {
            return l.longValue();
        }
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    public static blnu m69740a(Time time) {
        if (time == null) {
            return null;
        }
        bxvd da = blnu.f127022e.mo74144da();
        if (time.mo58724c() != null) {
            int intValue = time.mo58724c().intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnu blnu = (blnu) da.f164949b;
            blnu.f127024a |= 1;
            blnu.f127025b = intValue;
        }
        if (time.mo58725d() != null) {
            int intValue2 = time.mo58725d().intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnu blnu2 = (blnu) da.f164949b;
            blnu2.f127024a |= 2;
            blnu2.f127026c = intValue2;
        }
        if (time.mo58727f() != null) {
            int intValue3 = time.mo58727f().intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnu blnu3 = (blnu) da.f164949b;
            blnu3.f127024a |= 4;
            blnu3.f127027d = intValue3;
        }
        return (blnu) da.mo74062i();
    }

    /* renamed from: a */
    public static blnv m69741a(DateTime dateTime) {
        int a;
        if (dateTime == null) {
            return null;
        }
        bxvd da = blnv.f127029k.mo74144da();
        if (dateTime.mo58630c() != null) {
            int intValue = dateTime.mo58630c().intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnv blnv = (blnv) da.f164949b;
            blnv.f127031a |= 1;
            blnv.f127032b = intValue;
        }
        if (dateTime.mo58631d() != null) {
            int intValue2 = dateTime.mo58631d().intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnv blnv2 = (blnv) da.f164949b;
            blnv2.f127031a |= 2;
            blnv2.f127033c = intValue2;
        }
        if (dateTime.mo58633f() != null) {
            int intValue3 = dateTime.mo58633f().intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnv blnv3 = (blnv) da.f164949b;
            blnv3.f127031a |= 4;
            blnv3.f127034d = intValue3;
        }
        if (!(dateTime.mo58635h() == null || (a = blnt.m107398a(dateTime.mo58635h().intValue())) == 0)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnv blnv4 = (blnv) da.f164949b;
            blnv4.f127036f = a;
            blnv4.f127031a |= 16;
        }
        if (dateTime.mo58637j() != null) {
            long longValue = dateTime.mo58637j().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnv blnv5 = (blnv) da.f164949b;
            blnv5.f127031a |= 64;
            blnv5.f127038h = longValue;
        }
        blnu a2 = m69740a(dateTime.mo58634g());
        if (a2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnv blnv6 = (blnv) da.f164949b;
            a2.getClass();
            blnv6.f127035e = a2;
            blnv6.f127031a |= 8;
        }
        if (!(dateTime.mo58636i() == null || blnr.m107396a(dateTime.mo58636i().intValue()) == 0)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnv blnv7 = (blnv) da.f164949b;
            blnv7.f127037g = 1;
            blnv7.f127031a |= 32;
        }
        if (dateTime.mo58638k() != null) {
            boolean booleanValue = dateTime.mo58638k().booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnv blnv8 = (blnv) da.f164949b;
            blnv8.f127031a |= 128;
            blnv8.f127039i = booleanValue;
        }
        if (dateTime.mo58639l() != null) {
            boolean booleanValue2 = dateTime.mo58639l().booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blnv blnv9 = (blnv) da.f164949b;
            blnv9.f127031a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            blnv9.f127040j = booleanValue2;
        }
        return (blnv) da.mo74062i();
    }

    /* renamed from: a */
    private static bloj m69742a(MonthlyPattern monthlyPattern) {
        bloo a;
        if (monthlyPattern == null) {
            return null;
        }
        bxvd da = bloj.f127093e.mo74144da();
        List c = monthlyPattern.mo58666c();
        if (c != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bloj bloj = (bloj) da.f164949b;
            if (!bloj.f127096b.mo73666a()) {
                bloj.f127096b = GeneratedMessageLite.m124019a(bloj.f127096b);
            }
            bxsy.m123078a(c, bloj.f127096b);
        }
        if (!(monthlyPattern.mo58667d() == null || (a = bloo.m107421a(monthlyPattern.mo58667d().intValue())) == null)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bloj bloj2 = (bloj) da.f164949b;
            bloj2.f127097c = a.f127122i;
            bloj2.f127095a |= 4;
        }
        Integer f = monthlyPattern.mo58669f();
        if (f != null) {
            int intValue = f.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bloj bloj3 = (bloj) da.f164949b;
            bloj3.f127095a |= 8;
            bloj3.f127098d = intValue;
        }
        return (bloj) da.mo74062i();
    }

    /* renamed from: a */
    public static blou m69743a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        bxvd da = blou.f127145c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blou blou = (blou) da.f164949b;
        str.getClass();
        blou.f127147a |= 1;
        blou.f127148b = str;
        return (blou) da.mo74062i();
    }

    /* renamed from: a */
    public static blox m69744a(TaskId taskId) {
        if (taskId == null) {
            return null;
        }
        bxvd da = blox.f127160d.mo74144da();
        if (!TextUtils.isEmpty(taskId.mo58696c())) {
            String c = taskId.mo58696c();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blox blox = (blox) da.f164949b;
            c.getClass();
            blox.f127162a |= 2;
            blox.f127163b = c;
        }
        if (!TextUtils.isEmpty(taskId.mo58697d())) {
            String d = taskId.mo58697d();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blox blox2 = (blox) da.f164949b;
            d.getClass();
            blox2.f127162a |= 4;
            blox2.f127164c = d;
        }
        return (blox) da.mo74062i();
    }

    /* renamed from: a */
    public static blrb m69745a(UpdateRecurrenceOptions updateRecurrenceOptions) {
        if (updateRecurrenceOptions == null) {
            return null;
        }
        bxvd da = blrb.f127426e.mo74144da();
        int a = blra.m107489a(updateRecurrenceOptions.f107053a);
        if (a != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrb blrb = (blrb) da.f164949b;
            blrb.f127429b = a - 1;
            blrb.f127428a |= 1;
        }
        boolean z = updateRecurrenceOptions.f107054b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blrb blrb2 = (blrb) da.f164949b;
        blrb2.f127428a |= 2;
        blrb2.f127430c = z;
        long b = m69748b(updateRecurrenceOptions);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blrb blrb3 = (blrb) da.f164949b;
        blrb3.f127428a |= 4;
        blrb3.f127431d = b;
        return (blrb) da.mo74062i();
    }

    /* renamed from: a */
    public static blrj m69746a(Task task) {
        blny blny;
        bloc bloc;
        blov blov;
        int a;
        blot blot;
        blol blol;
        blok blok;
        blod blod;
        bloq bloq;
        blos blos;
        int a2;
        int a3;
        blno blno;
        blnm blnm;
        int a4;
        blpy blpy = null;
        if (task == null) {
            return null;
        }
        bxvd da = blrj.f127456w.mo74144da();
        blox a5 = m69744a(task.mo58701c());
        if (a5 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrj blrj = (blrj) da.f164949b;
            a5.getClass();
            blrj.f127459b = a5;
            blrj.f127458a |= 1;
        }
        if (task.mo58702d() != null) {
            int a6 = blrm.m107501a(task.mo58702d().intValue());
            if (a6 != 0) {
                bxvd da2 = blrn.f127488c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blrn blrn = (blrn) da2.f164949b;
                blrn.f127491b = a6;
                blrn.f127490a |= 1;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blrj blrj2 = (blrj) da.f164949b;
                blrn blrn2 = (blrn) da2.mo74062i();
                blrn2.getClass();
                blrj2.f127461d = blrn2;
                blrj2.f127458a |= 4;
            } else {
                blrn blrn3 = blrn.f127488c;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blrj blrj3 = (blrj) da.f164949b;
                blrn3.getClass();
                blrj3.f127461d = blrn3;
                blrj3.f127458a |= 4;
            }
        }
        blnv a7 = m69741a(task.mo58712n());
        if (a7 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrj blrj4 = (blrj) da.f164949b;
            a7.getClass();
            blrj4.f127470m = a7;
            blrj4.f127458a |= 4096;
        }
        blnv a8 = m69741a(task.mo58713o());
        if (a8 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrj blrj5 = (blrj) da.f164949b;
            a8.getClass();
            blrj5.f127471n = a8;
            blrj5.f127458a |= 8192;
        }
        if (!TextUtils.isEmpty(task.mo58704f())) {
            String f = task.mo58704f();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrj blrj6 = (blrj) da.f164949b;
            f.getClass();
            blrj6.f127458a |= 8;
            blrj6.f127462e = f;
        }
        if (task.mo58705g() != null) {
            long longValue = task.mo58705g().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrj blrj7 = (blrj) da.f164949b;
            blrj7.f127458a |= 16;
            blrj7.f127463f = longValue;
        }
        if (task.mo58706h() != null) {
            long longValue2 = task.mo58706h().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrj blrj8 = (blrj) da.f164949b;
            blrj8.f127458a |= 32;
            blrj8.f127464g = longValue2;
        }
        if (task.mo58707i() != null) {
            boolean booleanValue = task.mo58707i().booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrj blrj9 = (blrj) da.f164949b;
            blrj9.f127458a |= 64;
            blrj9.f127465h = booleanValue;
        }
        if (task.mo58708j() != null) {
            boolean booleanValue2 = task.mo58708j().booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrj blrj10 = (blrj) da.f164949b;
            blrj10.f127458a |= 128;
            blrj10.f127466i = booleanValue2;
        }
        if (task.mo58709k() != null) {
            boolean booleanValue3 = task.mo58709k().booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrj blrj11 = (blrj) da.f164949b;
            blrj11.f127458a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            blrj11.f127467j = booleanValue3;
        }
        if (task.mo58710l() != null) {
            boolean booleanValue4 = task.mo58710l().booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrj blrj12 = (blrj) da.f164949b;
            blrj12.f127458a |= 512;
            blrj12.f127468k = booleanValue4;
        }
        if (task.mo58711m() != null) {
            long longValue3 = task.mo58711m().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrj blrj13 = (blrj) da.f164949b;
            blrj13.f127458a |= 2048;
            blrj13.f127469l = longValue3;
        }
        if (task.mo58716r() != null) {
            long longValue4 = task.mo58716r().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrj blrj14 = (blrj) da.f164949b;
            blrj14.f127458a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            blrj14.f127474q = longValue4;
        }
        Location p = task.mo58714p();
        if (p != null) {
            bxvd da3 = blny.f127043k.mo74144da();
            if (p.mo58655c() != null) {
                double doubleValue = p.mo58655c().doubleValue();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                blny blny2 = (blny) da3.f164949b;
                blny2.f127045a |= 1;
                blny2.f127046b = doubleValue;
            }
            if (p.mo58656d() != null) {
                double doubleValue2 = p.mo58656d().doubleValue();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                blny blny3 = (blny) da3.f164949b;
                blny3.f127045a |= 2;
                blny3.f127047c = doubleValue2;
            }
            if (p.mo58658f() != null) {
                String f2 = p.mo58658f();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                blny blny4 = (blny) da3.f164949b;
                f2.getClass();
                blny4.f127045a |= 4;
                blny4.f127048d = f2;
            }
            if (p.mo58659g() != null) {
                int intValue = p.mo58659g().intValue();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                blny blny5 = (blny) da3.f164949b;
                blny5.f127045a |= 8;
                blny5.f127049e = intValue;
            }
            if (p.mo58660h() != null) {
                int a9 = blnx.m107402a(p.mo58660h().intValue());
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                blny blny6 = (blny) da3.f164949b;
                if (a9 != 0) {
                    blny6.f127050f = a9;
                    blny6.f127045a |= 16;
                } else {
                    throw null;
                }
            }
            if (p.mo58662j() != null) {
                String j = p.mo58662j();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                blny blny7 = (blny) da3.f164949b;
                j.getClass();
                blny7.f127045a |= 64;
                blny7.f127052h = j;
            }
            blnj a10 = m69739a(p.mo58663k());
            if (a10 != null) {
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                blny blny8 = (blny) da3.f164949b;
                a10.getClass();
                blny8.f127053i = a10;
                blny8.f127045a |= 128;
            }
            bsak a11 = m69747a(p.mo58661i());
            if (a11 != null) {
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                blny blny9 = (blny) da3.f164949b;
                a11.getClass();
                blny9.f127051g = a11;
                blny9.f127045a |= 32;
            }
            if (!TextUtils.isEmpty(p.mo58664l())) {
                bxvd da4 = blnz.f127056c.mo74144da();
                String l = p.mo58664l();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                blnz blnz = (blnz) da4.f164949b;
                l.getClass();
                blnz.f127058a |= 1;
                blnz.f127059b = l;
                blnz blnz2 = (blnz) da4.mo74062i();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                blny blny10 = (blny) da3.f164949b;
                blnz2.getClass();
                blny10.f127054j = blnz2;
                blny10.f127045a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            blny = (blny) da3.mo74062i();
        } else {
            blny = null;
        }
        if (blny != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrj blrj15 = (blrj) da.f164949b;
            blny.getClass();
            blrj15.f127472o = blny;
            blrj15.f127458a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        }
        LocationGroup q = task.mo58715q();
        if (q != null) {
            bxvd da5 = bloc.f127061f.mo74144da();
            if (q.mo58649c() != null) {
                String c = q.mo58649c();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bloc bloc2 = (bloc) da5.f164949b;
                c.getClass();
                bloc2.f127063a |= 1;
                bloc2.f127064b = c;
            }
            if (!(q.mo58650d() == null || (a4 = blob.m107406a(q.mo58650d().intValue())) == 0)) {
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bloc bloc3 = (bloc) da5.f164949b;
                bloc3.f127065c = a4;
                bloc3.f127063a |= 2;
            }
            ChainInfo f3 = q.mo58652f();
            if (f3 != null) {
                bxvd da6 = blno.f127009d.mo74144da();
                String c2 = f3.mo58621c();
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                blno blno2 = (blno) da6.f164949b;
                c2.getClass();
                blno2.f127011a |= 2;
                blno2.f127012b = c2;
                if (f3.mo58622d() != null) {
                    bxvd da7 = blnn.f127004c.mo74144da();
                    bsak a12 = m69747a(f3.mo58622d());
                    if (a12 != null) {
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        blnn blnn = (blnn) da7.f164949b;
                        a12.getClass();
                        blnn.f127007b = a12;
                        blnn.f127006a |= 1;
                    }
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    blno blno3 = (blno) da6.f164949b;
                    blnn blnn2 = (blnn) da7.mo74062i();
                    blnn2.getClass();
                    blno3.f127013c = blnn2;
                    blno3.f127011a |= 4;
                }
                blno = (blno) da6.mo74062i();
            } else {
                blno = null;
            }
            if (blno != null) {
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bloc bloc4 = (bloc) da5.f164949b;
                blno.getClass();
                bloc4.f127066d = blno;
                bloc4.f127063a |= 4;
            }
            CategoryInfo g = q.mo58653g();
            if (g != null) {
                bxvd da8 = blnm.f126998e.mo74144da();
                if (!TextUtils.isEmpty(g.mo58616c())) {
                    String c3 = g.mo58616c();
                    if (da8.f164950c) {
                        da8.mo74035c();
                        da8.f164950c = false;
                    }
                    blnm blnm2 = (blnm) da8.f164949b;
                    c3.getClass();
                    blnm2.f127000a |= 1;
                    blnm2.f127001b = c3;
                }
                if (!TextUtils.isEmpty(g.mo58619f())) {
                    String f4 = g.mo58619f();
                    if (da8.f164950c) {
                        da8.mo74035c();
                        da8.f164950c = false;
                    }
                    blnm blnm3 = (blnm) da8.f164949b;
                    f4.getClass();
                    blnm3.f127000a |= 2;
                    blnm3.f127003d = f4;
                }
                blnm = (blnm) da8.mo74062i();
            } else {
                blnm = null;
            }
            if (blnm != null) {
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bloc bloc5 = (bloc) da5.f164949b;
                blnm.getClass();
                bloc5.f127067e = blnm;
                bloc5.f127063a |= 8;
            }
            bloc = (bloc) da5.mo74062i();
        } else {
            bloc = null;
        }
        if (bloc != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrj blrj16 = (blrj) da.f164949b;
            bloc.getClass();
            blrj16.f127473p = bloc;
            blrj16.f127458a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        }
        RecurrenceInfo v = task.mo58718v();
        if (v != null) {
            bxvd da9 = blov.f127149f.mo74144da();
            Recurrence c4 = v.mo58677c();
            if (c4 != null) {
                bxvd da10 = blot.f127133j.mo74144da();
                if (!(c4.mo58683c() == null || (a3 = blof.m107410a(c4.mo58683c().intValue())) == 0)) {
                    if (da10.f164950c) {
                        da10.mo74035c();
                        da10.f164950c = false;
                    }
                    blot blot2 = (blot) da10.f164949b;
                    blot2.f127136b = a3 - 1;
                    blot2.f127135a |= 1;
                }
                if (c4.mo58684d() != null) {
                    int intValue2 = c4.mo58684d().intValue();
                    if (da10.f164950c) {
                        da10.mo74035c();
                        da10.f164950c = false;
                    }
                    blot blot3 = (blot) da10.f164949b;
                    blot3.f127135a |= 2;
                    blot3.f127137c = intValue2;
                }
                RecurrenceStart f5 = c4.mo58686f();
                if (f5 != null) {
                    bxvd da11 = blol.f127107c.mo74144da();
                    blnv a13 = m69741a(f5.mo58693c());
                    if (a13 != null) {
                        if (da11.f164950c) {
                            da11.mo74035c();
                            da11.f164950c = false;
                        }
                        blol blol2 = (blol) da11.f164949b;
                        a13.getClass();
                        blol2.f127110b = a13;
                        blol2.f127109a |= 1;
                    }
                    blol = (blol) da11.mo74062i();
                } else {
                    blol = null;
                }
                if (blol != null) {
                    if (da10.f164950c) {
                        da10.mo74035c();
                        da10.f164950c = false;
                    }
                    blot blot4 = (blot) da10.f164949b;
                    blol.getClass();
                    blot4.f127138d = blol;
                    blot4.f127135a |= 4;
                }
                RecurrenceEnd g2 = c4.mo58687g();
                if (g2 != null) {
                    bxvd da12 = blok.f127099f.mo74144da();
                    blnv a14 = m69741a(g2.mo58671c());
                    if (a14 != null) {
                        if (da12.f164950c) {
                            da12.mo74035c();
                            da12.f164950c = false;
                        }
                        blok blok2 = (blok) da12.f164949b;
                        a14.getClass();
                        blok2.f127102b = a14;
                        blok2.f127101a |= 1;
                    }
                    if (g2.mo58672d() != null) {
                        int intValue3 = g2.mo58672d().intValue();
                        if (da12.f164950c) {
                            da12.mo74035c();
                            da12.f164950c = false;
                        }
                        blok blok3 = (blok) da12.f164949b;
                        blok3.f127101a |= 4;
                        blok3.f127103c = intValue3;
                    }
                    if (g2.mo58674f() != null) {
                        boolean booleanValue5 = g2.mo58674f().booleanValue();
                        if (da12.f164950c) {
                            da12.mo74035c();
                            da12.f164950c = false;
                        }
                        blok blok4 = (blok) da12.f164949b;
                        blok4.f127101a |= 8;
                        blok4.f127104d = booleanValue5;
                    }
                    blnv a15 = m69741a(g2.mo58675g());
                    if (a15 != null) {
                        if (da12.f164950c) {
                            da12.mo74035c();
                            da12.f164950c = false;
                        }
                        blok blok5 = (blok) da12.f164949b;
                        a15.getClass();
                        blok5.f127105e = a15;
                        blok5.f127101a |= 16;
                    }
                    blok = (blok) da12.mo74062i();
                } else {
                    blok = null;
                }
                if (blok != null) {
                    if (da10.f164950c) {
                        da10.mo74035c();
                        da10.f164950c = false;
                    }
                    blot blot5 = (blot) da10.f164949b;
                    blok.getClass();
                    blot5.f127139e = blok;
                    blot5.f127135a |= 8;
                }
                DailyPattern h = c4.mo58688h();
                if (h != null) {
                    bxvd da13 = blod.f127069e.mo74144da();
                    blnu a16 = m69740a(h.mo58625c());
                    if (a16 != null) {
                        if (da13.f164950c) {
                            da13.mo74035c();
                            da13.f164950c = false;
                        }
                        blod blod2 = (blod) da13.f164949b;
                        a16.getClass();
                        blod2.f127072b = a16;
                        blod2.f127071a |= 1;
                    }
                    if (!(h.mo58626d() == null || (a2 = blnt.m107398a(h.mo58626d().intValue())) == 0)) {
                        if (da13.f164950c) {
                            da13.mo74035c();
                            da13.f164950c = false;
                        }
                        blod blod3 = (blod) da13.f164949b;
                        blod3.f127073c = a2;
                        blod3.f127071a |= 2;
                    }
                    if (h.mo58628f() != null) {
                        boolean booleanValue6 = h.mo58628f().booleanValue();
                        if (da13.f164950c) {
                            da13.mo74035c();
                            da13.f164950c = false;
                        }
                        blod blod4 = (blod) da13.f164949b;
                        blod4.f127071a |= 4;
                        blod4.f127074d = booleanValue6;
                    }
                    blod = (blod) da13.mo74062i();
                } else {
                    blod = null;
                }
                if (blod != null) {
                    if (da10.f164950c) {
                        da10.mo74035c();
                        da10.f164950c = false;
                    }
                    blot blot6 = (blot) da10.f164949b;
                    blod.getClass();
                    blot6.f127140f = blod;
                    blot6.f127135a |= 16;
                }
                WeeklyPattern i = c4.mo58689i();
                if (i != null) {
                    bxvd da14 = bloq.f127124c.mo74144da();
                    int[] a17 = aowr.m69720a(i.mo58729c());
                    bxvq bxvq = bloo.f127120h;
                    bxvp[] bxvpArr = (bxvp[]) Array.newInstance(bloo.class, a17.length);
                    int i2 = 0;
                    while (i2 < a17.length) {
                        bloo a18 = bloo.m107421a(a17[i2]);
                        if (a18 != null) {
                            bxvpArr[i2] = a18;
                            i2++;
                        } else {
                            throw new NullPointerException(String.format("Unable to convert %d using %s", Integer.valueOf(a17[i2]), bxvq.getClass().getName()));
                        }
                    }
                    List<bloo> asList = Arrays.asList((bloo[]) bxvpArr);
                    if (da14.f164950c) {
                        da14.mo74035c();
                        da14.f164950c = false;
                    }
                    bloq bloq2 = (bloq) da14.f164949b;
                    if (!bloq2.f127126a.mo73666a()) {
                        bloq2.f127126a = GeneratedMessageLite.m124019a(bloq2.f127126a);
                    }
                    for (bloo bloo : asList) {
                        bloq2.f127126a.mo74153d(bloo.f127122i);
                    }
                    bloq = (bloq) da14.mo74062i();
                } else {
                    bloq = null;
                }
                if (bloq != null) {
                    if (da10.f164950c) {
                        da10.mo74035c();
                        da10.f164950c = false;
                    }
                    blot blot7 = (blot) da10.f164949b;
                    bloq.getClass();
                    blot7.f127141g = bloq;
                    blot7.f127135a |= 32;
                }
                bloj a19 = m69742a(c4.mo58690j());
                if (a19 != null) {
                    if (da10.f164950c) {
                        da10.mo74035c();
                        da10.f164950c = false;
                    }
                    blot blot8 = (blot) da10.f164949b;
                    a19.getClass();
                    blot8.f127142h = a19;
                    blot8.f127135a |= 64;
                }
                YearlyPattern k = c4.mo58691k();
                if (k != null) {
                    bxvd da15 = blos.f127128e.mo74144da();
                    bloj a20 = m69742a(k.mo58732c());
                    if (a20 != null) {
                        if (da15.f164950c) {
                            da15.mo74035c();
                            da15.f164950c = false;
                        }
                        blos blos2 = (blos) da15.f164949b;
                        a20.getClass();
                        blos2.f127131b = a20;
                        blos2.f127130a |= 1;
                    }
                    List d = k.mo58733d();
                    if (d != null) {
                        int[] a21 = aowr.m69720a(d);
                        bxvq bxvq2 = bloi.f127090m;
                        ArrayList arrayList = new ArrayList(a21.length);
                        int i3 = 0;
                        while (i3 < a21.length) {
                            bloi a22 = bloi.m107413a(a21[i3]);
                            if (a22 != null) {
                                arrayList.add(a22);
                                i3++;
                            } else {
                                throw new NullPointerException(String.format("Unable to convert %d using %s", Integer.valueOf(a21[i3]), bxvq2.getClass().getName()));
                            }
                        }
                        List<bloi> unmodifiableList = Collections.unmodifiableList(arrayList);
                        if (da15.f164950c) {
                            da15.mo74035c();
                            da15.f164950c = false;
                        }
                        blos blos3 = (blos) da15.f164949b;
                        if (!blos3.f127132c.mo73666a()) {
                            blos3.f127132c = GeneratedMessageLite.m124019a(blos3.f127132c);
                        }
                        for (bloi bloi : unmodifiableList) {
                            blos3.f127132c.mo74153d(bloi.f127092n);
                        }
                    }
                    blos = (blos) da15.mo74062i();
                } else {
                    blos = null;
                }
                if (blos != null) {
                    if (da10.f164950c) {
                        da10.mo74035c();
                        da10.f164950c = false;
                    }
                    blot blot9 = (blot) da10.f164949b;
                    blos.getClass();
                    blot9.f127143i = blos;
                    blot9.f127135a |= 128;
                }
                blot = (blot) da10.mo74062i();
            } else {
                blot = null;
            }
            if (blot != null) {
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                blov blov2 = (blov) da9.f164949b;
                blot.getClass();
                blov2.f127152b = blot;
                blov2.f127151a |= 1;
            }
            blou a23 = m69743a(v.mo58678d());
            if (a23 != null) {
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                blov blov3 = (blov) da9.f164949b;
                a23.getClass();
                blov3.f127153c = a23;
                blov3.f127151a |= 2;
            }
            if (v.mo58680f() != null) {
                boolean booleanValue7 = v.mo58680f().booleanValue();
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                blov blov4 = (blov) da9.f164949b;
                blov4.f127151a |= 4;
                blov4.f127154d = booleanValue7;
            }
            if (v.mo58681g() != null) {
                boolean booleanValue8 = v.mo58681g().booleanValue();
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                blov blov5 = (blov) da9.f164949b;
                blov5.f127151a |= 8;
                blov5.f127155e = booleanValue8;
            }
            blov = (blov) da9.mo74062i();
        } else {
            blov = null;
        }
        if (blov != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrj blrj17 = (blrj) da.f164949b;
            blov.getClass();
            blrj17.f127476s = blov;
            blrj17.f127458a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        }
        byte[] w = task.mo58719w();
        if (w != null) {
            try {
                blnk blnk = (blnk) GeneratedMessageLite.m124016a(blnk.f126992a, w, bxus.m123744c());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blrj blrj18 = (blrj) da.f164949b;
                blnk.getClass();
                blrj18.f127477t = blnk;
                blrj18.f127458a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
            } catch (bxwf e) {
                aowu.m69733a("RemindersModelToProto", "Error parsing assistance", new Object[0]);
            }
        }
        byte[] u = task.mo58717u();
        if (u != null) {
            try {
                blow blow = (blow) GeneratedMessageLite.m124016a(blow.f127157a, u, bxus.m123744c());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blrj blrj19 = (blrj) da.f164949b;
                blow.getClass();
                blrj19.f127475r = blow;
                blrj19.f127458a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            } catch (bxwf e2) {
                aowu.m69733a("RemindersModelToProto", "Error parsing extensions", new Object[0]);
            }
        }
        ExternalApplicationLink y = task.mo58722y();
        if (y != null) {
            bxvd da16 = blpy.f127303d.mo74144da();
            if (!(y.mo58641c() == null || (a = blpx.m107458a(y.mo58641c().intValue())) == 0)) {
                if (da16.f164950c) {
                    da16.mo74035c();
                    da16.f164950c = false;
                }
                blpy blpy2 = (blpy) da16.f164949b;
                blpy2.f127306b = a;
                blpy2.f127305a = 1 | blpy2.f127305a;
            }
            if (y.mo58642d() != null) {
                String d2 = y.mo58642d();
                if (da16.f164950c) {
                    da16.mo74035c();
                    da16.f164950c = false;
                }
                blpy blpy3 = (blpy) da16.f164949b;
                d2.getClass();
                blpy3.f127305a = 2 | blpy3.f127305a;
                blpy3.f127307c = d2;
            }
            blpy = (blpy) da16.mo74062i();
        }
        if (blpy != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrj blrj20 = (blrj) da.f164949b;
            blpy.getClass();
            blrj20.f127478u = blpy;
            blrj20.f127458a |= 2097152;
        }
        return (blrj) da.mo74062i();
    }

    /* renamed from: a */
    private static bsak m69747a(FeatureIdProto featureIdProto) {
        if (featureIdProto == null) {
            return null;
        }
        bxvd da = bsak.f143860d.mo74144da();
        long longValue = featureIdProto.mo58645c().longValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsak bsak = (bsak) da.f164949b;
        bsak.f143862a |= 1;
        bsak.f143863b = longValue;
        long longValue2 = featureIdProto.mo58646d().longValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsak bsak2 = (bsak) da.f164949b;
        bsak2.f143862a |= 2;
        bsak2.f143864c = longValue2;
        return (bsak) da.mo74062i();
    }
}
