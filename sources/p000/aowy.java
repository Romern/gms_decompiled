package p000;

import android.content.ContentValues;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: aowy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aowy {
    /* renamed from: a */
    private static long m69750a(blnu blnu) {
        return (((long) blnu.f127025b) * 3600000) + (((long) blnu.f127026c) * 60000) + (((long) blnu.f127027d) * 1000);
    }

    /* renamed from: a */
    private static void m69751a(ContentValues contentValues, blnj blnj) {
        if (blnj != null) {
            contentValues.put("address_country", blnj.f126984b);
            contentValues.put("address_locality", blnj.f126985c);
            contentValues.put("address_region", blnj.f126986d);
            contentValues.put("address_street_address", blnj.f126987e);
            contentValues.put("address_street_number", blnj.f126988f);
            contentValues.put("address_street_name", blnj.f126989g);
            contentValues.put("address_postal_code", blnj.f126990h);
            contentValues.put("address_name", blnj.f126991i);
            return;
        }
        contentValues.putNull("address_country");
        contentValues.putNull("address_locality");
        contentValues.putNull("address_region");
        contentValues.putNull("address_street_address");
        contentValues.putNull("address_street_number");
        contentValues.putNull("address_street_name");
        contentValues.putNull("address_postal_code");
        contentValues.putNull("address_name");
    }

    /* renamed from: a */
    private static void m69752a(ContentValues contentValues, blnm blnm) {
        contentValues.putNull("place_types");
        if (blnm == null) {
            contentValues.putNull("category_id");
            contentValues.putNull("display_name");
            return;
        }
        contentValues.put("category_id", blnm.f127001b);
        contentValues.put("display_name", blnm.f127003d);
        if (blnm.f127002c.size() != 0) {
            contentValues.put("place_types", TextUtils.join(",", blnm.f127002c));
        }
    }

    /* renamed from: a */
    private static void m69753a(ContentValues contentValues, blnn blnn) {
        if (blnn != null) {
            bsak bsak = blnn.f127007b;
            if (bsak == null) {
                bsak = bsak.f143860d;
            }
            m69768a(contentValues, bsak, "chain_id_");
            return;
        }
        m69768a(contentValues, (bsak) null, "chain_id_");
    }

    /* renamed from: a */
    private static void m69754a(ContentValues contentValues, blno blno) {
        if (blno != null) {
            contentValues.put("chain_name", blno.f127012b);
            blnn blnn = blno.f127013c;
            if (blnn == null) {
                blnn = blnn.f127004c;
            }
            m69753a(contentValues, blnn);
            return;
        }
        contentValues.putNull("chain_name");
        m69753a(contentValues, (blnn) null);
    }

    /* renamed from: a */
    private static void m69755a(ContentValues contentValues, blnu blnu, String str) {
        if (blnu == null) {
            contentValues.putNull(str.concat("hour"));
            contentValues.putNull(str.concat("minute"));
            contentValues.putNull(str.concat("second"));
            return;
        }
        Integer num = null;
        contentValues.put(str.concat("hour"), (blnu.f127024a & 1) != 0 ? Integer.valueOf(blnu.f127025b) : null);
        contentValues.put(str.concat("minute"), (blnu.f127024a & 2) != 0 ? Integer.valueOf(blnu.f127026c) : null);
        String concat = str.concat("second");
        if ((blnu.f127024a & 4) != 0) {
            num = Integer.valueOf(blnu.f127027d);
        }
        contentValues.put(concat, num);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public static void m69756a(ContentValues contentValues, blnv blnv, String str) {
        Integer num;
        Integer num2;
        Integer num3;
        Long l = null;
        if (blnv == null) {
            contentValues.putNull(str.concat("year"));
            contentValues.putNull(str.concat("month"));
            contentValues.putNull(str.concat("day"));
            contentValues.putNull(str.concat("period"));
            contentValues.putNull(str.concat("absolute_time_ms"));
            m69755a(contentValues, (blnu) null, str);
            contentValues.putNull(str.concat("date_range"));
            contentValues.putNull(str.concat("unspecified_future_time"));
            contentValues.putNull(str.concat("all_day"));
            return;
        }
        String concat = str.concat("year");
        if ((blnv.f127031a & 1) != 0) {
            num = Integer.valueOf(blnv.f127032b);
        } else {
            num = null;
        }
        contentValues.put(concat, num);
        String concat2 = str.concat("month");
        if ((blnv.f127031a & 2) != 0) {
            num2 = Integer.valueOf(blnv.f127033c);
        } else {
            num2 = null;
        }
        contentValues.put(concat2, num2);
        String concat3 = str.concat("day");
        if ((blnv.f127031a & 4) != 0) {
            num3 = Integer.valueOf(blnv.f127034d);
        } else {
            num3 = null;
        }
        contentValues.put(concat3, num3);
        if ((blnv.f127031a & 16) != 0) {
            String concat4 = str.concat("period");
            int a = blnt.m107398a(blnv.f127036f);
            if (a == 0) {
                a = 1;
            }
            contentValues.put(concat4, Integer.valueOf(a));
        }
        String concat5 = str.concat("absolute_time_ms");
        if ((blnv.f127031a & 64) != 0) {
            l = Long.valueOf(blnv.f127038h);
        }
        contentValues.put(concat5, l);
        blnu blnu = blnv.f127035e;
        if (blnu == null) {
            blnu = blnu.f127022e;
        }
        m69755a(contentValues, blnu, str);
        if ((blnv.f127031a & 32) != 0) {
            contentValues.put(str.concat("date_range"), (Integer) 1);
        }
        if ((blnv.f127031a & 128) != 0) {
            aowv.m69738a(contentValues, str.concat("unspecified_future_time"), Boolean.valueOf(blnv.f127039i));
        } else {
            contentValues.putNull(str.concat("unspecified_future_time"));
        }
        if ((blnv.f127031a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            aowv.m69738a(contentValues, str.concat("all_day"), Boolean.valueOf(blnv.f127040j));
        } else {
            contentValues.putNull(str.concat("all_day"));
        }
    }

    /* renamed from: a */
    private static void m69757a(ContentValues contentValues, blnz blnz) {
        if (blnz != null) {
            contentValues.put("location_alias_id", blnz.f127059b);
        } else {
            contentValues.putNull("location_alias_id");
        }
    }

    /* renamed from: a */
    private static void m69758a(ContentValues contentValues, blod blod) {
        Boolean bool = null;
        if (blod == null) {
            m69755a(contentValues, (blnu) null, "daily_pattern_");
            contentValues.putNull("daily_pattern_period");
            contentValues.putNull("daily_pattern_all_day");
            return;
        }
        blnu blnu = blod.f127072b;
        if (blnu == null) {
            blnu = blnu.f127022e;
        }
        m69755a(contentValues, blnu, "daily_pattern_");
        if ((blod.f127071a & 2) != 0) {
            int a = blnt.m107398a(blod.f127073c);
            if (a == 0) {
                a = 1;
            }
            contentValues.put("daily_pattern_period", Integer.valueOf(a));
        }
        if ((blod.f127071a & 4) != 0) {
            bool = Boolean.valueOf(blod.f127074d);
        }
        aowv.m69738a(contentValues, "daily_pattern_all_day", bool);
    }

    /* renamed from: a */
    private static void m69759a(ContentValues contentValues, bloj bloj) {
        Integer num;
        if (bloj != null) {
            contentValues.put("monthly_pattern_month_day", aosx.m69486a(bqcn.m112584a(bloj.f127096b)));
            if ((bloj.f127095a & 4) != 0) {
                bloo a = bloo.m107421a(bloj.f127097c);
                if (a == null) {
                    a = bloo.MONDAY;
                }
                contentValues.put("monthly_pattern_week_day", Integer.valueOf(a.f127122i));
            }
            if ((bloj.f127095a & 8) != 0) {
                num = Integer.valueOf(bloj.f127098d);
            } else {
                num = null;
            }
            contentValues.put("monthly_pattern_week_day_number", num);
            return;
        }
        contentValues.putNull("monthly_pattern_month_day");
        contentValues.putNull("monthly_pattern_week_day");
        contentValues.putNull("monthly_pattern_week_day_number");
    }

    /* renamed from: a */
    private static void m69760a(ContentValues contentValues, blok blok) {
        Integer num;
        Boolean bool = null;
        if (blok == null) {
            m69756a(contentValues, (blnv) null, "recurrence_end_");
            contentValues.putNull("recurrence_end_num_occurrences");
            contentValues.putNull("recurrence_end_auto_renew");
            m69756a(contentValues, (blnv) null, "recurrence_end_auto_renew_until_");
            return;
        }
        blnv blnv = blok.f127102b;
        if (blnv == null) {
            blnv = blnv.f127029k;
        }
        m69756a(contentValues, blnv, "recurrence_end_");
        if ((blok.f127101a & 4) != 0) {
            num = Integer.valueOf(blok.f127103c);
        } else {
            num = null;
        }
        contentValues.put("recurrence_end_num_occurrences", num);
        if ((blok.f127101a & 8) != 0) {
            bool = Boolean.valueOf(blok.f127104d);
        }
        aowv.m69738a(contentValues, "recurrence_end_auto_renew", bool);
        blnv blnv2 = blok.f127105e;
        if (blnv2 == null) {
            blnv2 = blnv.f127029k;
        }
        m69756a(contentValues, blnv2, "recurrence_end_auto_renew_until_");
    }

    /* renamed from: a */
    private static void m69761a(ContentValues contentValues, blol blol) {
        if (blol != null) {
            blnv blnv = blol.f127110b;
            if (blnv == null) {
                blnv = blnv.f127029k;
            }
            m69756a(contentValues, blnv, "recurrence_start_");
            return;
        }
        m69756a(contentValues, (blnv) null, "recurrence_start_");
    }

    /* renamed from: a */
    private static void m69762a(ContentValues contentValues, bloq bloq) {
        if (bloq != null) {
            contentValues.put("weekly_pattern_weekday", aosx.m69486a(bxzo.m124572a((bloo[]) new bxvv(bloq.f127126a, bloq.f127123b).toArray(new bloo[0]))));
        } else {
            contentValues.putNull("weekly_pattern_weekday");
        }
    }

    /* renamed from: a */
    private static void m69763a(ContentValues contentValues, blos blos) {
        Integer num;
        if (blos != null) {
            contentValues.put("yearly_pattern_year_month", aosx.m69486a(bxzo.m124571a(new bxvv(blos.f127132c, blos.f127127d))));
            bloj bloj = blos.f127131b;
            if (bloj == null) {
                bloj = bloj.f127093e;
            }
            if (bloj != null) {
                contentValues.put("yearly_pattern_monthly_pattern_month_day", aosx.m69486a(bqcn.m112584a(bloj.f127096b)));
                if ((bloj.f127095a & 4) != 0) {
                    bloo a = bloo.m107421a(bloj.f127097c);
                    if (a == null) {
                        a = bloo.MONDAY;
                    }
                    contentValues.put("yearly_pattern_monthly_pattern_week_day", Integer.valueOf(a.f127122i));
                }
                if ((bloj.f127095a & 8) != 0) {
                    num = Integer.valueOf(bloj.f127098d);
                } else {
                    num = null;
                }
                contentValues.put("yearly_pattern_monthly_pattern_week_day_number", num);
                return;
            }
            contentValues.putNull("yearly_pattern_monthly_pattern_month_day");
            contentValues.putNull("yearly_pattern_monthly_pattern_week_day");
            contentValues.putNull("yearly_pattern_monthly_pattern_week_day_number");
            return;
        }
        contentValues.putNull("yearly_pattern_year_month");
        contentValues.putNull("yearly_pattern_monthly_pattern_month_day");
        contentValues.putNull("yearly_pattern_monthly_pattern_week_day");
        contentValues.putNull("yearly_pattern_monthly_pattern_week_day_number");
    }

    /* renamed from: a */
    private static void m69764a(ContentValues contentValues, blot blot) {
        Integer num;
        blol blol;
        blok blok;
        blod blod;
        bloq bloq;
        bloj bloj;
        blos blos = null;
        if (blot == null) {
            contentValues.putNull("recurrence_frequency");
            contentValues.putNull("recurrence_every");
            m69761a(contentValues, (blol) null);
            m69760a(contentValues, (blok) null);
            m69758a(contentValues, (blod) null);
            m69762a(contentValues, (bloq) null);
            m69759a(contentValues, (bloj) null);
            m69763a(contentValues, (blos) null);
            return;
        }
        int i = 1;
        if ((blot.f127135a & 1) != 0) {
            int a = blof.m107410a(blot.f127136b);
            if (a != 0) {
                i = a;
            }
            contentValues.put("recurrence_frequency", Integer.valueOf(i - 1));
        }
        if ((blot.f127135a & 2) != 0) {
            num = Integer.valueOf(blot.f127137c);
        } else {
            num = null;
        }
        contentValues.put("recurrence_every", num);
        if ((blot.f127135a & 4) != 0) {
            blol = blot.f127138d;
            if (blol == null) {
                blol = blol.f127107c;
            }
        } else {
            blol = null;
        }
        m69761a(contentValues, blol);
        if ((blot.f127135a & 8) != 0) {
            blok = blot.f127139e;
            if (blok == null) {
                blok = blok.f127099f;
            }
        } else {
            blok = null;
        }
        m69760a(contentValues, blok);
        if ((blot.f127135a & 16) != 0) {
            blod = blot.f127140f;
            if (blod == null) {
                blod = blod.f127069e;
            }
        } else {
            blod = null;
        }
        m69758a(contentValues, blod);
        if ((blot.f127135a & 32) != 0) {
            bloq = blot.f127141g;
            if (bloq == null) {
                bloq = bloq.f127124c;
            }
        } else {
            bloq = null;
        }
        m69762a(contentValues, bloq);
        if ((blot.f127135a & 64) != 0) {
            bloj = blot.f127142h;
            if (bloj == null) {
                bloj = bloj.f127093e;
            }
        } else {
            bloj = null;
        }
        m69759a(contentValues, bloj);
        if ((blot.f127135a & 128) != 0 && (blos = blot.f127143i) == null) {
            blos = blos.f127128e;
        }
        m69763a(contentValues, blos);
    }

    /* renamed from: a */
    private static void m69765a(ContentValues contentValues, blou blou) {
        if (blou != null) {
            contentValues.put("recurrence_id", blou.f127148b);
        } else {
            contentValues.putNull("recurrence_id");
        }
    }

    /* renamed from: a */
    public static void m69766a(ContentValues contentValues, blpr blpr) {
        blpq blpq = blpr.f127280a;
        if (blpq == null) {
            blpq = blpq.f127273c;
        }
        if ((blpq.f127275a & 1) != 0) {
            blpq blpq2 = blpr.f127280a;
            if (blpq2 == null) {
                blpq2 = blpq.f127273c;
            }
            blnu blnu = blpq2.f127276b;
            if (blnu == null) {
                blnu = blnu.f127022e;
            }
            contentValues.put("morning_customized_time", Long.valueOf(m69750a(blnu)));
        }
        blpq blpq3 = blpr.f127281b;
        if (blpq3 == null) {
            blpq3 = blpq.f127273c;
        }
        if ((blpq3.f127275a & 1) != 0) {
            blpq blpq4 = blpr.f127281b;
            if (blpq4 == null) {
                blpq4 = blpq.f127273c;
            }
            blnu blnu2 = blpq4.f127276b;
            if (blnu2 == null) {
                blnu2 = blnu.f127022e;
            }
            contentValues.put("afternoon_customized_time", Long.valueOf(m69750a(blnu2)));
        }
        blpq blpq5 = blpr.f127282c;
        if (blpq5 == null) {
            blpq5 = blpq.f127273c;
        }
        if ((blpq5.f127275a & 1) != 0) {
            blpq blpq6 = blpr.f127282c;
            if (blpq6 == null) {
                blpq6 = blpq.f127273c;
            }
            blnu blnu3 = blpq6.f127276b;
            if (blnu3 == null) {
                blnu3 = blnu.f127022e;
            }
            contentValues.put("evening_customized_time", Long.valueOf(m69750a(blnu3)));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void} */
    /* renamed from: a */
    public static void m69767a(ContentValues contentValues, blrj blrj) {
        blox blox;
        String str;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        blnv blnv;
        blnv blnv2;
        blny blny;
        bloc bloc;
        blov blov;
        blpy blpy;
        String str2;
        blot blot;
        blou blou;
        Boolean bool5;
        Boolean bool6;
        blno blno;
        blnm blnm;
        Double d;
        Double d2;
        Integer num;
        String str3;
        String str4;
        int i = 1;
        Long l5 = null;
        if ((blrj.f127458a & 1) != 0) {
            blox = blrj.f127459b;
            if (blox == null) {
                blox = blox.f127160d;
            }
        } else {
            blox = null;
        }
        if (blox != null) {
            if ((blox.f127162a & 2) != 0) {
                str3 = blox.f127163b;
            } else {
                str3 = null;
            }
            contentValues.put("client_assigned_id", str3);
            if ((blox.f127162a & 4) != 0) {
                str4 = blox.f127164c;
            } else {
                str4 = null;
            }
            contentValues.put("client_assigned_thread_id", str4);
        }
        blrn blrn = blrj.f127461d;
        if (blrn == null) {
            blrn = blrn.f127488c;
        }
        if ((blrn.f127490a & 1) != 0) {
            blrn blrn2 = blrj.f127461d;
            if (blrn2 == null) {
                blrn2 = blrn.f127488c;
            }
            int a = blrm.m107501a(blrn2.f127491b);
            if (a == 0) {
                a = 16;
            }
            contentValues.put("task_list", Integer.valueOf(a));
        }
        if ((blrj.f127458a & 8) != 0) {
            str = blrj.f127462e;
        } else {
            str = null;
        }
        contentValues.put("title", str);
        if ((blrj.f127458a & 16) != 0) {
            l = Long.valueOf(blrj.f127463f);
        } else {
            l = null;
        }
        contentValues.put("created_time_millis", l);
        if ((blrj.f127458a & 32) != 0) {
            l2 = Long.valueOf(blrj.f127464g);
        } else {
            l2 = null;
        }
        contentValues.put("archived_time_ms", l2);
        if ((blrj.f127458a & 2048) != 0) {
            l3 = Long.valueOf(blrj.f127469l);
        } else {
            l3 = null;
        }
        contentValues.put("snoozed_time_millis", l3);
        if ((blrj.f127458a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
            l4 = Long.valueOf(blrj.f127474q);
        } else {
            l4 = null;
        }
        contentValues.put("location_snoozed_until_ms", l4);
        if ((blrj.f127458a & 64) != 0) {
            bool = Boolean.valueOf(blrj.f127465h);
        } else {
            bool = null;
        }
        aowv.m69738a(contentValues, "archived", bool);
        if ((blrj.f127458a & 128) != 0) {
            bool2 = Boolean.valueOf(blrj.f127466i);
        } else {
            bool2 = null;
        }
        aowv.m69738a(contentValues, "deleted", bool2);
        if ((blrj.f127458a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            bool3 = Boolean.valueOf(blrj.f127467j);
        } else {
            bool3 = null;
        }
        aowv.m69738a(contentValues, "pinned", bool3);
        if ((blrj.f127458a & 512) != 0) {
            bool4 = Boolean.valueOf(blrj.f127468k);
        } else {
            bool4 = null;
        }
        aowv.m69738a(contentValues, "snoozed", bool4);
        if ((blrj.f127458a & 4096) != 0) {
            blnv = blrj.f127470m;
            if (blnv == null) {
                blnv = blnv.f127029k;
            }
        } else {
            blnv = null;
        }
        m69756a(contentValues, blnv, "due_date_");
        if ((blrj.f127458a & 8192) != 0) {
            blnv2 = blrj.f127471n;
            if (blnv2 == null) {
                blnv2 = blnv.f127029k;
            }
        } else {
            blnv2 = null;
        }
        m69756a(contentValues, blnv2, "event_date_");
        if ((blrj.f127458a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
            blny = blrj.f127472o;
            if (blny == null) {
                blny = blny.f127043k;
            }
        } else {
            blny = null;
        }
        if (blny == null) {
            contentValues.putNull("lat");
            contentValues.putNull("lng");
            contentValues.putNull("name");
            contentValues.putNull("radius_meters");
            contentValues.putNull("location_type");
            contentValues.putNull("display_address");
            m69751a(contentValues, (blnj) null);
            m69768a(contentValues, (bsak) null, "location_");
            m69757a(contentValues, (blnz) null);
        } else {
            if ((blny.f127045a & 1) != 0) {
                d = Double.valueOf(blny.f127046b);
            } else {
                d = null;
            }
            contentValues.put("lat", d);
            if ((blny.f127045a & 2) != 0) {
                d2 = Double.valueOf(blny.f127047c);
            } else {
                d2 = null;
            }
            contentValues.put("lng", d2);
            contentValues.put("name", blny.f127048d);
            if ((blny.f127045a & 8) != 0) {
                num = Integer.valueOf(blny.f127049e);
            } else {
                num = null;
            }
            contentValues.put("radius_meters", num);
            if ((16 & blny.f127045a) == 0) {
                contentValues.putNull("location_type");
            } else {
                int a2 = blnx.m107402a(blny.f127050f);
                if (a2 == 0) {
                    a2 = 1;
                }
                contentValues.put("location_type", Integer.valueOf(a2));
            }
            contentValues.put("display_address", blny.f127052h);
            blnj blnj = blny.f127053i;
            if (blnj == null) {
                blnj = blnj.f126981j;
            }
            m69751a(contentValues, blnj);
            bsak bsak = blny.f127051g;
            if (bsak == null) {
                bsak = bsak.f143860d;
            }
            m69768a(contentValues, bsak, "location_");
            blnz blnz = blny.f127054j;
            if (blnz == null) {
                blnz = blnz.f127056c;
            }
            m69757a(contentValues, blnz);
        }
        if ((blrj.f127458a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
            bloc = blrj.f127473p;
            if (bloc == null) {
                bloc = bloc.f127061f;
            }
        } else {
            bloc = null;
        }
        if (bloc == null) {
            contentValues.putNull("location_query");
            contentValues.putNull("location_query_type");
            m69754a(contentValues, (blno) null);
            m69752a(contentValues, (blnm) null);
        } else {
            contentValues.put("location_query", bloc.f127064b);
            if ((bloc.f127063a & 2) == 0) {
                contentValues.putNull("location_query_type");
            } else {
                int a3 = blob.m107406a(bloc.f127065c);
                if (a3 == 0) {
                    a3 = 1;
                }
                contentValues.put("location_query_type", Integer.valueOf(a3));
            }
            if ((bloc.f127063a & 4) != 0) {
                blno = bloc.f127066d;
                if (blno == null) {
                    blno = blno.f127009d;
                }
            } else {
                blno = null;
            }
            m69754a(contentValues, blno);
            if ((bloc.f127063a & 8) != 0) {
                blnm = bloc.f127067e;
                if (blnm == null) {
                    blnm = blnm.f126998e;
                }
            } else {
                blnm = null;
            }
            m69752a(contentValues, blnm);
        }
        if ((blrj.f127458a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0) {
            blov = blrj.f127476s;
            if (blov == null) {
                blov = blov.f127149f;
            }
        } else {
            blov = null;
        }
        if (blov == null) {
            m69764a(contentValues, (blot) null);
            m69765a(contentValues, (blou) null);
            contentValues.putNull("recurrence_master");
            contentValues.putNull("recurrence_exceptional");
        } else {
            if ((blov.f127151a & 1) != 0) {
                blot = blov.f127152b;
                if (blot == null) {
                    blot = blot.f127133j;
                }
            } else {
                blot = null;
            }
            m69764a(contentValues, blot);
            if ((blov.f127151a & 2) != 0) {
                blou = blov.f127153c;
                if (blou == null) {
                    blou = blou.f127145c;
                }
            } else {
                blou = null;
            }
            m69765a(contentValues, blou);
            if ((blov.f127151a & 4) != 0) {
                bool5 = Boolean.valueOf(blov.f127154d);
            } else {
                bool5 = null;
            }
            aowv.m69738a(contentValues, "recurrence_master", bool5);
            if ((blov.f127151a & 8) != 0) {
                bool6 = Boolean.valueOf(blov.f127155e);
            } else {
                bool6 = null;
            }
            aowv.m69738a(contentValues, "recurrence_exceptional", bool6);
        }
        if ((blrj.f127458a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) != 0) {
            blnk blnk = blrj.f127477t;
            if (blnk == null) {
                blnk = blnk.f126992a;
            }
            contentValues.put("assistance", blnk.serializeToBytes());
        }
        if ((blrj.f127458a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) != 0) {
            blow blow = blrj.f127475r;
            if (blow == null) {
                blow = blow.f127157a;
            }
            contentValues.put("extensions", blow.serializeToBytes());
        }
        int i2 = blrj.f127458a;
        if ((i2 & 4096) != 0) {
            contentValues.put("reminder_type", (Integer) 1);
        } else if ((i2 & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) == 0 && (i2 & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) == 0) {
            contentValues.put("reminder_type", (Integer) 0);
        } else {
            contentValues.put("reminder_type", (Integer) 2);
        }
        if ((blrj.f127458a & 2097152) != 0) {
            blpy = blrj.f127478u;
            if (blpy == null) {
                blpy = blpy.f127303d;
            }
        } else {
            blpy = null;
        }
        if (blpy == null) {
            contentValues.putNull("link_application");
            contentValues.putNull("link_id");
        } else {
            if ((blpy.f127305a & 1) != 0) {
                int a4 = blpx.m107458a(blpy.f127306b);
                if (a4 != 0) {
                    i = a4;
                }
                contentValues.put("link_application", Integer.valueOf(i));
            }
            if ((blpy.f127305a & 2) != 0) {
                str2 = blpy.f127307c;
            } else {
                str2 = null;
            }
            contentValues.put("link_id", str2);
        }
        if ((blrj.f127458a & 4194304) != 0) {
            l5 = Long.valueOf(blrj.f127479v);
        }
        contentValues.put("fired_time_millis", l5);
        contentValues.put("dirty_sync_bit", (Boolean) false);
    }

    /* renamed from: a */
    private static void m69768a(ContentValues contentValues, bsak bsak, String str) {
        if (bsak != null) {
            contentValues.put(str.concat("cell_id"), Long.valueOf(bsak.f143863b));
            contentValues.put(str.concat("fprint"), Long.valueOf(bsak.f143864c));
            return;
        }
        contentValues.putNull(str.concat("cell_id"));
        contentValues.putNull(str.concat("fprint"));
    }
}
