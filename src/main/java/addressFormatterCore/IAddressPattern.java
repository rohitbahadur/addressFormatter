package addressFormatterCore;

import java.util.regex.Pattern;

public interface IAddressPattern {

    final static Pattern POSTFIX_WITH_NO = Pattern.compile("(.*) No (\\d.*)");
    final static Pattern POSTFIX_WITH_COMMA = Pattern.compile("(\\D+), (\\d.*)");
    final static Pattern POSTFIX_NUMBER = Pattern.compile("(\\D+) (\\d.*)");
    final static Pattern PREFIX_NUMBER = Pattern.compile("(\\d+),? (.*)");

   }

